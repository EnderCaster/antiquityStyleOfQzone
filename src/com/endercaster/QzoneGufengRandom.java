package com.endercaster;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class QzoneGufengRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������һ��һ������ȥ�ģ��������������и�ʽ���������split����������
		String Sentence[] = { "xx��xx��xx��xx��", "xxxx��xxxx��������һ��xxxx��", "��˵xxxx����˵xxxx����󲻹�xxxx��", "xx��xx������һ��xxxx��",
				"һxһxһxx����x��x��xx��", " ��˵xxxx xxxx������xxxx xxxx��", "xxxx��xxxx���ղ���xxxx��" };
		String DoubleKeyS="��ɰ ���� ɱ�� �˼� �ػ� �绪 ���� ѪȾ īȾ ���� ���� ���� ��� �³� �ճ� �ɳ� ���� ���� ���� ���� ���� ���� ���� �κ� ���� �پ� һɢ�� İ· ���� Ц�� ǳЦ ���� ��̾ �̻� һ�� ���� ���� �һ� �滨 �仨 �̻� ���� ���� ���� ���� ���� �ֻ� ��æ İ�� ���� ���� ī�� ΢�� �ϳ� �տ� ���� ���� δ�� ��˫ ��� ���� ��˪ ���� ���� ���� ���� ǧ�� ֽɡ ���� ���� ���� �쳾 ���� ���� �춹 ���� ��˿ ��ʷ ��ڣ �׷� ���� �׹� ���� ��Ȫ ���� ��İ";
		String FourkeyS="����Եǳ ����� ĪʧĪ�� ������� �绨���� ��ˮ���� üĿ�续 ������ɢ �����価 �������� һ������";
		String Doublekey[]=DoubleKeyS.split(" ");
		String Fourkey[]=FourkeyS.split(" ");
		//���������һ�¿��� OK
		//for(int i=0; i<Doublekey.length;i++){
		//	System.out.println(Doublekey[i]);
		//}
		//���������һ��4�ֿ��� OK
				//for(int i=0; i<Fourkey.length;i++){
					//System.out.println(Fourkey[i]);
				//}
		//�򿪳��������ѡһ�¾�ʽ�Բ��ԣ�
		try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String SentenceNumS;
			int SentenceNum=1;
			for(int i=0; i<Sentence.length;i++){
				System.out.println(i+1+"."+Sentence[i]);
			}
			System.out.println("ϲ���ĸ���ʽ��");
			do{
				SentenceNumS=br.readLine();
				try{
					SentenceNum=Integer.parseInt(SentenceNumS);
				}catch(Exception e){
					System.out.println("Please Input an integer");
					SentenceNumS="Wrong";
				}
			}	while(SentenceNumS.length()>=2);
			//����Ҫ�߼���Random���ʺ���
			Random rand=new Random();
			/*�����������������飬����
			String output2[];
			String output4[];
			for(int i=0;i<4;i++){
				output2[i]=Doublekey[rand.nextInt(Doublekey.length)];
				output4[i]=Fourkey[rand.nextInt(Fourkey.length)];
				fuck.....���ص��Һú���һ����д
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
			 System.out.println(Doublekey[rand.nextInt(Doublekey.length)]+","+Doublekey[rand.nextInt(Doublekey.length)]+","+Doublekey[rand.nextInt(Doublekey.length)]+"��"+Doublekey[rand.nextInt(Doublekey.length)]);
			 break;
			case 2:
			 System.out.println(Fourkey[rand.nextInt(Fourkey.length)]+","+Fourkey[rand.nextInt(Fourkey.length)]+"��������һ��"+Fourkey[rand.nextInt(Fourkey.length)]+"��");
			 break;
			case 3:
				System.out.println("��˵"+Fourkey[rand.nextInt(Fourkey.length)]+"����˵"+Fourkey[rand.nextInt(Fourkey.length)]+"����󲻹�"+Fourkey[rand.nextInt(Fourkey.length)]+"��");
				break;
			case 4:
				System.out.println(Doublekey[rand.nextInt(Doublekey.length)]+","+Doublekey[rand.nextInt(Doublekey.length)]+",����һ��"+Fourkey[rand.nextInt(Fourkey.length)]+"��");
				break;
			case 5:
				String case5Filler[]={Doublekey[rand.nextInt(Doublekey.length)],Doublekey[rand.nextInt(Doublekey.length)],Doublekey[rand.nextInt(Doublekey.length)],Doublekey[rand.nextInt(Doublekey.length)]};
				System.out.println("һ"+case5Filler[0].charAt(0)+"һ"+case5Filler[0].charAt(1)+"һ"+case5Filler[1]+"����"+case5Filler[2].charAt(0)+"��"+case5Filler[2].charAt(1)+"��"+case5Filler[3]+"��");
				break;
			case 6:
				System.out.println("��˵"+Fourkey[rand.nextInt(Fourkey.length)]+" "+Fourkey[rand.nextInt(Fourkey.length)]+"������"+Fourkey[rand.nextInt(Fourkey.length)]+" "+Fourkey[rand.nextInt(Fourkey.length)]+"��");
				break;
			case 7:
				System.out.println(Fourkey[rand.nextInt(Fourkey.length)]+"��"+Fourkey[rand.nextInt(Fourkey.length)]+"���ղ���"+Fourkey[rand.nextInt(Fourkey.length)]+"��");
				break;
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
