package com.kh.oop.constructor;

/* 持失切
	 痕呪研 据馬澗 葵生稽 段奄鉢拝 呪 赤製
	 
	 段奄葵戚 = 0; 生稽 鞠嬢 赤聖 凶 段奄葵拭 1聖 隔嬢爽檎
	 段奄葵戚 1稽 段奄鉢喫
	 
	 1. 鋼発葵戚 蒸製(return 紫遂 X ,void X 是 砧 鯵稽 識情馬走 省製
	 2. 梓端(適掘什)研 段奄鉢 馬澗 号狛戚 弦聖 井酔 乞砧 紫遂 亜管
	 
	 	識情 森薦
	 		1.奄沙 持失切 - 琶呪亜 蒸製
	 		  public 適掘什戚硯() {
	 	
	 		 }
	 		2.琶呪 持失切 - 琶呪稽 閤焼醤 馬澗 葵戚 糎仙敗
	 		 			-琶呪稽 閤焼醤 馬澗 葵精 琶球拭 旋微 葵幻 亜管
	 		  public 適掘什戚硯(String しし, int けけ	, char ぞぞ) {
	 		  	  (食奄辞 痕呪誤引 琶球葵精 旭製)
	 		  	  this.痕呪誤1 = しし;
	 		  	  this.痕呪誤2 = けけ;
	 		  	  this.痕呪誤3 = ぞぞ;
	 		  		
	 		  		}
	 		 3.葵戚 走舛吉 持失切 
	 		 	琶球蟹 持失切拭辞 葵聖 走舛背層 持失切
	 		 		
	 
	 
 * */
public class ConstructorEx {
	//琶球 痕呪誤 舛税
	public String name;
	public String phone;
	public    int idNo;
	public    int money;
	//葵聖 走舛廃 持失切
	//持失切 奄沙, 琶呪持失切, 葵聖 走舛廃 持失切
	// 奄沙持失切
	public ConstructorEx() {
		
	}
	// 琶呪持失切 胤硲照拭 古鯵痕呪亜 琶呪稽 級嬢亜醤馬澗 持失切
	//憙 古(掻古) 某 鯵(晦陥,鯵脊) 棣 痕(痕馬陥) 皃 呪(収切亜)
	
	
	//                   琶呪稽 戚硯 
	public ConstructorEx(String inputName) {
		this.name = inputName;
	}
	
	
	/*
	public ConstructorEx(String inputName,String inputNumber) {
		this.name = inputName;
		this.phone = inputNumber;
	}
	*/
	//                   琶呪稽 戚硯 輩球肉腰硲 焼戚腰硲 榎衝
	public ConstructorEx(String inputName,String inputNumber,int inputId) {
		this.name = inputName;
		this.phone = inputNumber;
		this.idNo = inputId;
	}
	//
	public ConstructorEx(String inputName,String inputNumber,int inputId,int inputmoney) {
		this.name = inputName;
		this.phone = inputNumber;
		this.idNo = inputId;
		this.money = inputmoney;
	}
	
	//葵聖 走舛廃 持失切
	/* 葵聖 走舛廃 持失切澗 段奄税 葵幻 走舛背爽奄 凶庚拭
	 古鯵痕呪研(督虞耕斗) 琶呪稽 隔嬢爽走 省焼亀鞠走幻
	 奄沙 持失切人 持沿歯亜 業旭焼辞 察娃匝戚 蟹奄 凶庚拭
	 薄仙澗 績税稽 古鯵痕呪研 隔嬢捜
	 左搭精 public ConstructorEx(){}紫遂拝呪 赤製
	 紫遂 弦戚 馬走 省製
	 
	 */
	public ConstructorEx(int a) {
		//奄沙生稽 葵聖 走舛背辞 穿含馬澗 持失切
		//持失拝 凶採斗 葵聖 走舛背爽壱 蓄板 葵聖 痕井拝 呪 赤亀系 背捜
		name = "戚硯聖 脊径背爽室推."; //String 戚奄 ��庚拭 庚切伸聖 隔嬢醤敗
		phone = "腰硲研 脊径背爽室推."; //String 戚奄 ��庚拭 庚切伸聖 隔嬢醤敗
		idNo=             1; //int 戚奄 凶庚拭 収切葵聖 隔嬢醤敗
		money =           0;//int 戚奄 凶庚拭 収切葵聖 隔嬢醤敗
		
		
	}
	
	
	public static void main(String[] args) {

	}

}
