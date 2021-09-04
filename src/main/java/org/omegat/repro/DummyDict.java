package org.omegat.repro;

import org.omegat.core.dictionaries.DictionaryEntry;
import org.omegat.core.dictionaries.IDictionary;

import java.util.*;

public class DummyDict implements IDictionary {

    public DummyDict() {
    }

    /**
     * generate dummy article to reproduce.
     */
    @Override
    public List<DictionaryEntry> readArticles(String word) {
        List<DictionaryEntry> result = new ArrayList<>();
        List<DictionaryEntry> entries = DUMMY_DICTIONARY.getOrDefault(word, null);
        if (entries == null) {
            return result;
        }
        // multiply performance issue effect
        result.addAll(entries);
        result.addAll(entries);
        return result;
    }

    // dummy dictionary
    private final static Map<String, List<DictionaryEntry>> DUMMY_DICTIONARY = new HashMap<>();

    static {
        DUMMY_DICTIONARY.put("counter", Arrays.asList(
                new DictionaryEntry("Cóunter Reformátion,Cóunter−Reformátion ", " - &nbsp;<u>Cóunter Reformátion</u>&nbsp;&nbsp;<u>,Cóunter−Reformátion</u>【名】〔歴史〕[the 〜]反宗教改革運動《16−17世紀カトリック内部で起った改革運動》.")));
        DUMMY_DICTIONARY.put("leak", Arrays.asList(
                new DictionaryEntry("Lea−key ", "<u>Lea−key </u>&nbsp;&nbsp;/líːki/【名】リーキー《 \n" +
                        "&nbsp;&nbsp;<u>1</u>L(ouis) S(eymour) B(azett) 〜ⓜ 1903−72；英国の考古学者・人類学者；ケニアに居住；東アフリカで人類の祖先らしき化石を発見.\n&nbsp;&nbsp;<u>2</u>Mary (Douglas) 〜ⓕ 1913−96；英国の考古学者；1の妻で共同研究者.\n&nbsp;&nbsp;<u>3</u>Richard (Erskine Frere) 〜ⓜ 1944−；ケニアの人類学者；1と2の子；東アフリカで200万年以上前の原始人の遺骨を発見》.")));
        DUMMY_DICTIONARY.put("memory", Arrays.asList(
                new DictionaryEntry("Memory Stick  ", "<i>Memory Stick</i> &nbsp;&nbsp;◆ The D700 comes with an 8MB Sony Memory Stick.　D700には8メガバイトのソニー メモリースティックが付いてくる［付属している, 同梱されている］.")));
        DUMMY_DICTIONARY.put("avoid", Arrays.asList(
                new DictionaryEntry("avoid", "<i>avoid</i> " +
                        "&nbsp;&nbsp;vt. 〜を避ける, よける, 回避する, 忌避する, 〜しないようにする <−ing>, 防止する［防ぐ］\n◆ avoid detection by...　〈検知器, 人など〉に見つからないようにする\n◆ avoid waste　無駄を省く \n◆ avoid possibilities of any altercation　口論に発展する可能性を一切避ける\n ◆ avoid causing local overheating　局部的な過熱を引き起こすのを避ける \n◆ avoid the necessity for...(ing)　〜する必要性を無くす \n" +
                        "◆ to avoid customs duties　関税（の支払いを）を逃れるために \n◆ avoid becoming infected　感染しないようにする; 感染を防ぐ［防止する］; 感染予防をする \n◆ Avoid the use of...　〜の使用は避けてください; 〜は使わないようにしてください \n◆ the combined use of these products should be avoided　これら製品を組み合わせての使用［併用, 混用］は避けること \n◆ avoid duplicate payments from being made　二重払いが起きるのを防ぐ \n" +
                        "◆ care must be taken to avoid metastable states　準安定状態を回避するために注意しなければならない; ｟意訳｠メタステーブル対策をとる［講じる］必要がある \n◆ to avoid damage to the equipment　その機器に損傷をきたさないように（するために） \n◆ to avoid foods from sticking together　食材が互いにくっついてしまうのを避けるために［くっついてしまわないように］ \n◆ collisions that could have been avoided　避けようとすれば回避できた［防げた］衝突事故 \n" +
                        "◆ Avoid contact with the coasting blade.　惰性回転しているブレードに触れないようにしてください. \n◆ Many care givers want to be paid ”off the books,” in cash, so they can avoid taxes.　多くの介護者は, 税金逃れできるよう（賃金の）「闇」での現金払いを望んでいる. \n◆ If you try to avoid inspection, you may be subject to up to a $25,000 fine and/or one year in jail.　検査を忌避しようとした場合, 2万5千ドル以下の罰金もしくは1年以下の禁固, またはその両方に処せられることがある. \n" +
                        "◆ Avoid areas that are wet, oily, or subject to extreme temperatures or direct sunlight.　水気や油気のある場所や, 極端な温度になったり直射日光が当たったりする場所は, 避けてください. \n◆ Avoid storing your prints in places exposed to high temperatures, high humidity, or direct sunlight.　プリントの保管は高温になる場所, 湿気の多い場所あるいは直射日光の当たる場所は避けてください. \n" +
                        "◆ You cannot avoid having a cooling fan in your computer, if you do not have one, your computer will simply burn out.　コンピュータに冷却ファンを内蔵する［内部に搭載する］ことは避けられない. もしそれを欠かすと, コンピュータは当然焼き切れて［まさにオーバーヒートして］しまうだろう.")));
        DUMMY_DICTIONARY.put("reference", Arrays.asList(
                new DictionaryEntry("reference", "- &nbsp;<i>reference</i><br> &nbsp;&nbsp;<i>1</i> (a) 〜 言及, 参考, 参照; a 〜 （信用, 身元の）照会状, 身元保証人; a 〜 典拠, 出典, 参考文献, 参考文書, 参考資料, 参考書; adj. 基準の, 基準となる, 参照［参考］用の, リファレンス［レファレンス］‐<br>◆ for reference purposes　参考［参照］のため, 参考（資料）として, 参考までに<br>◆ with reference to...; in reference to...　〜に関して, 〜を基準として, 〜を参考に［言及, ｟意訳｠考慮］して<br>◆ for reference; for reference sake; for reference’s sake; for the sake of reference; for purposes of reference　参考（のため）に; ご参考までに<br>◆ marginal references　欄外の参考事項［注］<br>◆ a reference voltage　基準電圧<br>◆ a reference plane　基準面<br>◆ a reference surface　《光ファイバ》基"
                        + "準面<br>◆ a reference electrode　基準電極; （pH測定などでの）照合電極; （ケミカル・インピーダンス測定などでの）参照電極<br>◆ a reference line 基準線; 基準; 標線; 参照［参考, 関連］線<br>◆ (a) reference material; reference materials; (cf. a bibliography)　参考資料［文献, 文書］, 引 用文献<br>◆ values for reference purposes　参考値<br>◆ a letter of reference　（＊人物などについての）照会状［推薦状］<br>◆ a reference model 参照モデル<br>◆ a reference standard　《計測》参照標準<br>◆ a certified reference material　《計測》認証標準物質<br>◆ the ISO Reference Mode l for Open Systems Interconnection (OSI)　開放型システム間相互接続（OSI）のためのISO（国際標準化機構）参照モデル<br>◆ use it as a reference (a gainst which to compare...[to which we compare..., to which you can compare..., to which...will be compared])　それを（〜を比べる際の）基準［"
                        + "比較対象物］にする<br>◆ Reference No. 65　整理番号65番<br>◆ undergo an interview and reference check　面接と身元確認調査を受ける（＊a referenc e = 身元紹介先のことで, 以前勤めていた会社など）<br>◆ for future reference; for purposes of future reference; for the sake of future reference 今後［将来, 後日］の参考［参照］のために<br>◆ make reference to...　〜に言及する［触れる, 言い及ぶ］; 〜を参照する; 〜へ照会する<br>◆ model reference adaptive control (MRAC)　モデル規範型適応制御<br>◆ internal documents for reference purposes　参照用［参考用］の内部書類<br>◆ a volt age used as a standard of reference　比較対照［照合］の際に標準として用いられる電圧（＊意訳すると「基準電圧」となる）<br>◆ a reference color b urst signal　基準カラーバースト信号<br>◆ there was no reference made to...　〜についての記載はなかった<br>◆ a pocket−size computer for quick r"
                        + "eference　即座に参照するためのポケットサイズのコンピュータ<br>◆ Error! Reference source not found.　エラー! 参照元が見つかりません. （＊エラー メッセージで）<br>◆ when a reference is made to the topic at a later point in the text　本文のもっと後ろの箇所でそのテーマに話が及んだら<br>◆ This section makes many references to CD.　本節ではCDについてたびたび［何度も］言及する.<br>◆ For detailed information, reference should be ma de to the law and regulations.　詳しくは, 当該法令を参照して［ご覧］ください.<br>◆ Most of these should be regarded as for reference only.　こ れらのほとんどは参考［参照］のみにとどめるべきである.<br>◆ Reference should also be made to other OIT Guidelines.　その他のOIT基準も参考に［参 照］しなければならない.<br>◆ This sets the point that will serve as a reference for measurement.　これにより計測の基準となるポイントが設定され"
                        + "ます.<br>◆ Keep this manual handy for ready [quick] reference.　このマニュアルはすぐに参照できるよう手近に［見られるところに］保管してください .<br>◆ This is for your reference only.　これはご参考いただくためだけのものです.; これは参照用です.<br>◆ Dear Mr. Brown: Reference is made to your letter of February 10, 1998, with which you enclosed...　｟意訳｠ブラウン様, 〜をご同封いただきました1998年2月10日付けのお手紙についてで すが, 〜<br>◆ REFERENCE PUBLICATIONS: This Standard makes reference to the following Codes and Standards:　参考文献: 本規格は以下に記載する法 律及び標準規格を参照している.<br>◆ The above values are approximate and should be used for reference only.　上記の値はおおよそのものなので, 参 考としてのみ使って［｟意訳｠目安だけとして］ください.<br>◆ The counter allows you to keep track of the location of different programs or porti"
                        + "ons of tapes for quick reference at a later date.　このカウンターを使えば, 後日楽に頭出しできるように, テープ上のいろいろな番組の位置, つまり テープの各部分の位置を, 把握しておける.<br><br><i>2</i> vt. 〜を参照する, 〜を参考にする, 〈論文など〉に参考文献・資料の一覧表を載せる, 〜を引き合いに出す<br>◆ this is usually kept so that it can be referenced by other students　これは通常, 他の学生が参照［参考に］できるように保管される<br>◆ a peak audio amplitude that is referenced as ”0 dB” or ”100%”　｟意訳｠0 dB基準 あるいは 100%基準であるところのピーク［尖頭, 最大］オーディオ振幅<br>◆ You can then reference to any part of the tape later.　そうすれば後でテープのどの部分も参照［どの部分にもアクセス, どの部分も頭出し］することができる."),
                new DictionaryEntry("reference book", "<i>reference book</i><br>&nbsp;&nbsp;a 〜 参考図書（＊辞書, 辞典など)"),
                new DictionaryEntry("referendum", "<i>referendum</i><br>&nbsp;&nbsp;a 〜 (pl. 〜s, referenda) レファレンダム, 国民投票, 住民投票, 人民投票, 一般投票, 全員投票, 請訓書(セイクンショ)（＊外国駐在の外交官が本国政府の命令 ・指示を仰ぐために提出する文書）<br>◆ hold a national referendum on [over] whether...should...　〜べきであるかどうかについての国民投票を実施す る<br>◆ a possible national referendum on a multiparty system　多党体制（移行）についての是非を問う現実のものとなりそうな［現実味をおびている ］国民投票"),
                new DictionaryEntry("referential", "<i>referential</i><br>&nbsp;&nbsp;adj. 関係のある, 参照の<br> ◆ referential integrity　《コンピュ》参照整合, 参照の整合性"),
                new DictionaryEntry("referral", "<i>referral</i> <br>&nbsp;&nbsp;(a) 〜 参照, 照会, 〈人材などの〉推薦［紹介］<br>◆ a referral bonus　人材紹介ボーナス（＊自分が勤めている会社に人を紹介して,その人が入社した場合にもらえる紹介料. ハイテク企業が良質の技術者を集めるために設けている縁故採用制度である a referral bonus program の話で）<b r>◆ an employee referral program (ERP) whereby employees recommend qualified friends, relatives or colleagues　社員が資格のある［必要条件を備 えた, 適格の, 資質のある, 有能な］友人や親類や仲間を推薦する（ところの）社員リファーラル［リファラル］採用制度（＊従業員による紹介を通した縁故 ・コネ中途採用）<br>◆ A letter of referral from your physician may be required.　あなたの医師からの紹介状が要るかもしれません.<br>◆ I asked my family doctor for a referral to a cancer specialist.　私はかかりつけの医者に癌専門医に渡す紹介状を（＊書いてくださいと）依頼した.<br>◆ The mo st powerful form of marketing is word−of−mouth referrals.　最も強力なマーケティングの形態は, 口コミによる紹介や推薦です."),
                new DictionaryEntry("ref・er・ence", "- &nbsp;<u>ref・er・ence </u>&nbsp;&nbsp; **/réfɚr[GAIJI=nA12D]ns/〔初16c；refer+−ence〕<br>&nbsp;& nbsp;〜 【名】<br>&nbsp;&nbsp;<u>1</u>🅄((正式))〔…への〕言及, 論及(mention)〔to〕；🄲言及した事柄；引用‖a passing 〜 ほんの少しの言及/There isno 〜 [No 〜 is made] <u>to</u> the accident in today’s paper. 今日の新聞にはその事故のことは何も書いていない.<br>&nbsp;&nbsp;<u>2</u>🅄〔…の〕 参照, 参考〔<u>to</u>〕；🄲出典, 参考書, 典拠；参考事項；参照記号(〜 mark)(【略】ref.)‖This dictionary is only for 〜. 本辞典は閲覧専用[帯出禁 止]です(cf. 〜 book)/for easy 〜 参照しやすいように.<br>&nbsp;&nbsp;<u>3</u>🄲🅄(人物・才能などの)照会, 問合せ；🄲(履歴書などの)照会先, 身元保証 人；人物証明書, 推薦状《◆本人に見せない；cf. testimonial》‖a letter of 〜 推薦状.<br>&nbsp;&nbsp;<u>4</u>🅄〔…との〕関係, 関連；〔…への〕考慮, 〔…の〕点〔<u>to</u>〕‖have [bear] little 〜 <u>to</u> age 年齢にほとんど関係がない.<br>&nbsp;&nbsp;<u>5</u>🅄〔…への〕委託, 付託〔<u>to</u>〕‖"
                        + "terms of 〜 ((英))(調査・捜索などの)委託された権限；委任事項.<br>&nbsp;&nbsp;<u>6</u>〔言語〕<br>&nbsp;&nbsp;<u>a</u>🅄指示《語句・記号とそれが 指示する対象との関係》.<br>&nbsp;&nbsp;<u>b</u>🄲指示対象[内容].<br>&nbsp;&nbsp;<u>7</u>🄲(計測・評価の)基準.<br>&nbsp;&nbsp;▼in réference to O< br>&nbsp;&nbsp;((正式))＝with REFERENCE to.<br>&nbsp;&nbsp;▼(júst) for réference<br>&nbsp;&nbsp;参考までに(お知らせします[書いてください]).<br >&nbsp;&nbsp;▼(júst) for (one’s ówn) fúture réference<br>&nbsp;&nbsp;将来必要となった時のために；後学のため《◆何かものを聞くときの前置き》.<br >&nbsp;&nbsp;▼màke réference to O<br>&nbsp;&nbsp;…に言及する；…を参照する.<br>&nbsp;&nbsp;▼withòut réference to O<br>&nbsp;&nbsp;…に関係なく； …を考慮に入れずに.<br>&nbsp;&nbsp;▼with réference to O<br>&nbsp;&nbsp;((正式))…に関して(about).<br>&nbsp;&nbsp;〜 【動】｜他｜<br>&nbsp;&nbsp; <u>1</u>〈書物・論文など〉に参照事項[参考文献表]を付ける.<br>&nbsp;&nbsp;<u>2</u>…を参照する.<br>&nbsp;&nbsp;〜 【前】((略式))〔商業〕…に関して(with reference to).")
        ));
    }

}
