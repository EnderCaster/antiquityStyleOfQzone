package com.endercaster;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class QzoneGufengRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//本来想一个一个打上去的，后来发现这种有格式的用数组的split方法更方便
		String Sentence[] = { "xx，xx，xx了xx。", "xxxx，xxxx，不过是一场xxxx。", "你说xxxx，我说xxxx，最后不过xxxx。", "xx，xx，许我一场xxxx。",
				"一x一x一xx，半x半x半xx。", " 你说xxxx xxxx，后来xxxx xxxx。", "xxxx，xxxx，终不敌xxxx。" };
		String DoubleKeyS="朱砂 天下 杀伐 人家 韶华 风华 繁华 血染 墨染 白衣 素衣 嫁衣 倾城 孤城 空城 旧城 旧人 伊人 心疼 春风 古琴 无情 迷离 奈何 断弦 焚尽 一散乱 陌路 乱世 笑靥 浅笑 明眸 轻叹 烟火 一生 三生 浮生 桃花 梨花 落花 烟花 离殇 情殇 爱殇 剑殇 灼伤 仓皇 匆忙 陌上 清商 焚香 墨香 微凉 断肠 痴狂 凄凉 黄梁 未央 成双 无恙 虚妄 凝霜 洛阳 长安 江南 忘川 千年 纸伞 烟雨 回眸 公子 红尘 红颜 红衣 红豆 红线 青丝 青史 青冢 白发 白首 白骨 黄土 黄泉 碧落 紫陌";
		String FourkeyS="情深缘浅 情深不寿 莫失莫忘 阴阳相隔 如花美眷 似水流年 眉目如画 曲终人散 繁华落尽 不诉离殇 一世长安";
		String Doublekey[]=DoubleKeyS.split(" ");
		String Fourkey[]=FourkeyS.split(" ");
		//我们先输出一下看看 OK
		//for(int i=0; i<Doublekey.length;i++){
		//	System.out.println(Doublekey[i]);
		//}
		//我们再输出一下4字看看 OK
				//for(int i=0; i<Fourkey.length;i++){
					//System.out.println(Fourkey[i]);
				//}
		//打开程序得让人选一下句式对不对？
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String SentenceNumS;
			int SentenceNum=1;
			for(int i=0; i<Sentence.length;i++){
				System.out.println(i+1+"."+Sentence[i]);
			}
			System.out.println("喜欢哪个句式？");
			do{
				SentenceNumS=br.readLine();
				try{
					SentenceNum=Integer.parseInt(SentenceNumS);
				}catch(Exception e){
					System.out.println("Please Input an integer");
					SentenceNumS="Wrong";
				}
			}	while(SentenceNumS.length()>=2);
			//不需要逻辑用Random最适合了
			Random rand=new Random();
			/*我们先生成两个数组，储存
			String output2[];
			String output4[];
			for(int i=0;i<4;i++){
				output2[i]=Doublekey[rand.nextInt(Doublekey.length)];
				output4[i]=Fourkey[rand.nextInt(Fourkey.length)];
				fuck.....查重等我好好想一下再写
				if(i!=1){
					for(int j=0;j<i;j++){
						while(output2[i].equals(output2[j])){
							output2[j]=Doublekey[rand.nextInt(Doublekey.length)];
						}
						while(output4[i].equals(output4[j])){
							output4[j]=Fourkey[rand.nextInt(Fourkey.length)];
						}
					}
				}
			}*/
			switch(SentenceNum){
			case 1:
			 System.out.println(Doublekey[rand.nextInt(Doublekey.length)]+","+Doublekey[rand.nextInt(Doublekey.length)]+","+Doublekey[rand.nextInt(Doublekey.length)]+"了"+Doublekey[rand.nextInt(Doublekey.length)]);
			 break;
			case 2:
			 System.out.println(Fourkey[rand.nextInt(Fourkey.length)]+","+Fourkey[rand.nextInt(Fourkey.length)]+"，不过是一场"+Fourkey[rand.nextInt(Fourkey.length)]+"。");
			 break;
			case 3:
				System.out.println("你说"+Fourkey[rand.nextInt(Fourkey.length)]+"，我说"+Fourkey[rand.nextInt(Fourkey.length)]+"，最后不过"+Fourkey[rand.nextInt(Fourkey.length)]+"。");
				break;
			case 4:
				System.out.println(Doublekey[rand.nextInt(Doublekey.length)]+","+Doublekey[rand.nextInt(Doublekey.length)]+",许我一场"+Fourkey[rand.nextInt(Fourkey.length)]+"。");
				break;
			case 5:
				String case5Filler[]={Doublekey[rand.nextInt(Doublekey.length)],Doublekey[rand.nextInt(Doublekey.length)],Doublekey[rand.nextInt(Doublekey.length)],Doublekey[rand.nextInt(Doublekey.length)]};
				System.out.println("一"+case5Filler[0].charAt(0)+"一"+case5Filler[0].charAt(1)+"一"+case5Filler[1]+"，半"+case5Filler[2].charAt(0)+"半"+case5Filler[2].charAt(1)+"半"+case5Filler[3]+"。");
				break;
			case 6:
				System.out.println("你说"+Fourkey[rand.nextInt(Fourkey.length)]+" "+Fourkey[rand.nextInt(Fourkey.length)]+"，后来"+Fourkey[rand.nextInt(Fourkey.length)]+" "+Fourkey[rand.nextInt(Fourkey.length)]+"。");
				break;
			case 7:
				System.out.println(Fourkey[rand.nextInt(Fourkey.length)]+"，"+Fourkey[rand.nextInt(Fourkey.length)]+"，终不敌"+Fourkey[rand.nextInt(Fourkey.length)]+"。");
				break;
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
