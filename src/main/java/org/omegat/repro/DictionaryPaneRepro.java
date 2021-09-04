package org.omegat.repro;

import org.omegat.core.Core;
import org.omegat.core.CoreEvents;
import org.omegat.core.dictionaries.IDictionary;
import org.omegat.core.dictionaries.IDictionaryFactory;
import org.omegat.core.events.IApplicationEventListener;

import java.io.File;

public class DictionaryPaneRepro implements IDictionaryFactory {

    public static void loadPlugins() {
        CoreEvents.registerApplicationEventListener(new DummyApplicationEventListener());
    }

    public static void unloadPlugins() {
    }

    @Override
    public boolean isSupportedFile(final File file) {
        // Please put an any file on dictionary folder of test project
        return true;
    }

    @Override
    public IDictionary loadDict(final File file) {
        return new DummyDict();
    }

    static class DummyApplicationEventListener implements IApplicationEventListener {
        @Override
        public void onApplicationStartup() {
            Core.getDictionaries().addDictionaryFactory(new DictionaryPaneRepro());
        }

        @Override
        public void onApplicationShutdown() {
        }
    }

}