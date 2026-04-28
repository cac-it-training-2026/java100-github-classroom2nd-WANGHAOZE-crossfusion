package lesson07.challenge06;

class Samurai {

	void fight() {
		System.out.println("戦うよ～。");
	}

	void work() {
		System.out.println("何かして働くよ～");
	}

}

final class UltimateSwordsman extends Samurai {

}

class EasySwordsman extends UltimateSwordsman {

}

public class CastleTown {

	public static void main(String[] args) {
		System.out.println("究極の剣豪クラスを継承してみます。\n");

		EasySwordsman easySwordsman = new EasySwordsman();

	}
}
