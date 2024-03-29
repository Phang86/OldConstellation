package com.yyzy.constellation.utils;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
    public static String setContent(){
        String content = "此应用是一款星座配对多功能软件，功能包括：星座介绍、星配分析、星座配对、星座运势、出行天气、姓氏查找等功能。";
        return content;
    }

    public static List<String> string = Arrays.asList(
            "有了理想，有了目标，有了奋斗，才会在未来的旅途中走得更远。",
            "没有了理想，青春之花也便凋谢了。",
            "人生没有绝对精彩，雨后或许没有彩虹，但后退一步确是失败。",
            "被山花野草迷住的人，永远也登不上风光无限，近在眼前的顶峰。",
            "积极思考造成积极人生，消极思考造成消极人生。",
            "无情岁月増中减，有味青春苦后甜。集雄心壮志，创锦绣前程。",
            "你想成为哪类人，并不取决于你的能力，而是取决于你的选择。",
            "只要一个人还有追求，他就没有老；直到后悔取代了梦想，一个人才算老。",
            "天道酬勤再现辉煌王者风，闻鸡起舞成就拼搏劲旅师。",
            "他们是为我立账户的人，虽然他们没想要收回成本，但现在也该是我们加倍奉还的时候了，也许直到他们离我远去，都还是还不清呀。",
            "一个人起码要在感情上失恋一次，在事业上失败一次，在选择上失误一次，才能真正地长大。所以，别怕输不起，一切来得及！",
            "生活熬过苦难，才有回忆的笑谈。愿你成为自己的太阳，无需凭借谁的光。",
            "目标的坚定是性格中最必要的力量源泉之一，也是成功的利器之一。没有它，天才也会在矛盾无定的迷径中徒劳无功。",
            "你可以遗憾，但是你绝对不能后悔。遗憾证明你努力过了，只是力有不逮。而后悔，只能说明你当时没努力过。",
            "你只看到我是带刺的仙人掌，却没见过我艳绝人寰的绽放。每一个平凡又普通的我们，没有富贵的出身，也没有傲人的外貌，只能靠自己的努力奋斗在这个残酷的世界上生存下去。但是不要灰心，总有一天我们会像仙人掌一样，怒放生命的绚丽。",
            "感觉活着真好，生死也就是一秒钟的事，一件事，想通了是天堂，想不通就是地狱。既然活着，就要好好活着。",
            "抱怨是一件没有意义的事情，如果实在难以忍受周围的环境，那就暗自努力，然后跳出那个圈子",
            "孤独不怕，这世界上永远满足二八定律，百分之二十的人拥有百分之八十的财产，百分之八十的人，为百分之二十的人服务。所以，你要学会在孤独的中前行，让自己变得更好。",
            "生命中，有些人来了又去，有些人去而复返，有些人近在咫尺，有些人远在天涯。或许在某两条路的尽头相遇，结伴同行了一段路程，又在下一个分岔路口道别。无论如何，也终免不了曲终人散的伤感。",
            "生活之所以感觉这么累，有一小半是源于生存的压力，而另一大半却是源于攀比的心理。人生在世没有绝对的公平，但是相对的公平还是有的。不同的人放在同一个天平上，如果你得到的要比别人多，那么你也必须比别人承受更多。",
            "成熟，不是你绷起脸，显得多么老道；不是你知道多少大是大非，懂得多少大道理，而是你能理解身边发生的小事都可能有它的不得已。",
            "数字化、智能化、网络化只是手段，为民服务才是目的，别让屏幕变成了屏障。",
            "节日的意义并不仅仅在于纪念，更在于在这一天做具有相同意义的事，从而形成强大的共识生长力和行为影响力。",
            "我们该有”不唯上不唯书”的实事求是态度，也该破除“学历鄙视链”、超越“唯学历论”，更要永葆一颗不卑不亢向前看的心。",
            "不管是一手交钱一手交货的买卖，还是千里快递、万里传信的交易，每一笔成交的背后不只是口碑的发酵，更是健全的法律法规、有力的行业监管在发挥作用。",
            "叛逆的猛士出于人间；他屹立着，洞见一切已改和现有的废墟和荒坟，记得一切深广和久远的苦痛，正视一切重叠淤积的凝血，深知一切已死，方生，将生和未生。",
            "生活中，我们每个人都会有烦恼和忧愁，都曾经历挫折与不顺。阳光的人并不是万事如意，而是他们明白，击败苦难的不会是沮丧与抱怨，而是乐观与坚持。顺境也好，逆境也罢，保持一份积极向上的心态，才能走得更加稳健。",
            "没有伤痕累累，哪来皮糙肉厚，英雄自古多磨难。回头看，崎岖坎坷；向前看，永不言弃！",
            "一切伟大成就，都是接续奋斗的结果，一切伟大事业，都需要在继往开来中推进。",
            "生活是公平的，它对每一个都是公平的。如果你觉得生活亏久了你，一定是你自己有些什么事儿亏久了自己，但你把它赖到生活上。山有顶峰，湖有彼岸，在人生漫漫长途中，万物皆有回转，当我们觉得余味苦濯，请你相信，一切终有回甘。",
            "人生如一场修行，得意时“一日看尽长安花”，艰难时“倒新停浊酒杯”。但生命的跋涉不能回头，哪怕“畏途巉岩不可攀”，也要“会当凌绝顶”。哪怕“无人会，登临意”，也要“猛志固常在”。从经典中汲取“九万里风鹏正举”的力量，历练“也无风雨也无晴”的豁然，“待阳日”，我们“还来就花”。",
            "所有人都在和过去好好告别之后，开始了新的生活，我们带着爱和希望踏上了人生又一段征程。此时回首，对过去满是感激。正是因为那些黯淡混浊的过去，才成就了此刻这个闪闪发光的自己。");


    public final static  List<String> URLS = Arrays.asList(
            "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fc-ssl.duitang.com%2Fuploads%2Fitem%2F201507%2F04%2F20150704104529_LGAuQ.thumb.700_0.jpeg&refer=http%3A%2F%2Fc-ssl.duitang.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1665570591&t=39775d38143604b60af3f4bf4ce67640"
            ,"https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg2.doubanio.com%2Fview%2Frichtext%2Flarge%2Fpublic%2Fp241851172.jpg&refer=http%3A%2F%2Fimg2.doubanio.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1665570683&t=d5c0074c33839bccd3007ed7dcf88b64"
            ,"https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg3.doubanio.com%2Fview%2Fgroup_topic%2Fl%2Fpublic%2Fp267785241.jpg&refer=http%3A%2F%2Fimg3.doubanio.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1665570735&t=32281d2ea4ca2cce59f1cc1642023d93"
            ,"https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg1.doubanio.com%2Fview%2Fgroup_topic%2Fl%2Fpublic%2Fp262296599.jpg&refer=http%3A%2F%2Fimg1.doubanio.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1665570981&t=3bb8a2275db835a59a94ed2af4eefd6d"
            ,"https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg3.doubanio.com%2Fview%2Fgroup_topic%2Fl%2Fpublic%2Fp262319980.jpg&refer=http%3A%2F%2Fimg3.doubanio.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1665571080&t=159a92ed9e60bd34f788e5a8a81ec875"
            ,"https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg3.doubanio.com%2Fview%2Fgroup_topic%2Fl%2Fpublic%2Fp262296613.jpg&refer=http%3A%2F%2Fimg3.doubanio.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1665571133&t=30357f34e0fb30e389330f4c86077036"
            ,"https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fc-ssl.duitang.com%2Fuploads%2Fitem%2F202004%2F05%2F20200405210120_jlclt.jpg&refer=http%3A%2F%2Fc-ssl.duitang.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1665571269&t=3088ad47b497010ca102813010c71e9f"
            ,"https://pics0.baidu.com/feed/562c11dfa9ec8a1341ff8eb379531f88a1ecc050.jpeg?token=bf25c6431081b10b5a1ef5576682e04a"
            ,"https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg9.doubanio.com%2Fview%2Fgroup_topic%2Fl%2Fpublic%2Fp370906244.jpg&refer=http%3A%2F%2Fimg9.doubanio.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1665571363&t=d0aa2c9c5daf5804cdac90d0b3383e89"
            ,"https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fc-ssl.duitang.com%2Fuploads%2Fitem%2F202005%2F03%2F20200503165321_MQXcA.jpeg&refer=http%3A%2F%2Fc-ssl.duitang.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1665571508&t=6298e8553cb4834015d9066f1347560e"
            ,"https://pics5.baidu.com/feed/0ff41bd5ad6eddc4c062ad95b58b38fa536633aa.jpeg?token=5743bd81a8502cd2a443076cfd55dc42"
            ,"https://pics0.baidu.com/feed/562c11dfa9ec8a1341ff8eb379531f88a1ecc050.jpeg?token=bf25c6431081b10b5a1ef5576682e04a"
            ,"https://pics7.baidu.com/feed/72f082025aafa40fa8e307332f348d4879f0198b.jpeg?token=1a2f0dc71ac53f0e2993afede7b99eb7"
            ,"https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimg1.doubanio.com%2Fview%2Fgroup_topic%2Fl%2Fpublic%2Fp511465309.jpg&refer=http%3A%2F%2Fimg1.doubanio.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1665571734&t=b6fc8b8206c9cf540201817c040715f1"
            ,"https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fc-ssl.duitang.com%2Fuploads%2Fitem%2F202005%2F03%2F20200503033930_Srus4.jpeg&refer=http%3A%2F%2Fc-ssl.duitang.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1665571778&t=642a275f0714dcce2b2a5f8cfe875f79");


//    public static List<String> URLS = Arrays.asList("");
}

