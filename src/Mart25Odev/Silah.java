package Mart25Odev;

public class Silah {
	int enuzakMenzil;
	Sarjor sarjor;
	public Silah(int enuzakMenzil) {
		this.enuzakMenzil=enuzakMenzil;
	}

	public void Ateset(int menzil) {
		if (menzil>enuzakMenzil) {
			System.out.println("hedefi vuramadiniz. en uzak menzilden disari ates ettiniz.");
			sarjor.atesleme();
		}
		else if(sarjor==null) {
			System.out.println("silahta sarjor yok.sarjor doldurunuz.");
			sarjor.sarjorDoldurma();
		}
		else {
			if(sarjor.mevcutMermi<0) {
				System.out.println("merminiz yok. Sarjorunuz dolduruluyor.");
				sarjor.sarjorDoldurma();
			}
			else {
				System.out.println("hedef vuruldu.");
				sarjor.atesleme();
			}
		}
	}
}
