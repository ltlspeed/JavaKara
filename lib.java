import javakara.JavaKaraProgram;

public class lib extends JavaKaraProgram {

	public void myProgram() {
		toTree();
	}

	// Library von Ben & Levin

	void walk(int libwalklength) { // Lässt Kara in eine Richtung laufen
		int libwalkcount = 0;
		while (libwalklength > libwalkcount) {
			kara.move();
			libwalkcount ++;
		}
	}

	void toTree() { // Lässt Kara bis zum nächsten Baum laufen
		while (!kara.treeFront()) {
			kara.move();
		}
	}

	void turnAround() {	// Dreht Kara um 180°
		kara.turnRight();
		kara.turnRight();
	}

	void turnRight(int libturnRightdegree) { // Dreht Kara nach rechts
		int libturnRightcount = 0;
		while (libturnRightdegree > libturnRightcount) {
			kara.turnRight();
			libturnRightcount ++;
		}
	}

	void turnLeft(int libturnLeftdegree) { // Dreht Kara nach links
		int libturnLeftcount = 0;
		while (libturnLeftdegree > libturnLeftcount) {
			kara.turnLeft();
			libturnLeftcount ++;
		}
	}

	void invertLeaf() { // Invertiert das Blatt
		if (kara.onLeaf()) {
			kara.removeLeaf();
		}
		else {
			kara.putLeaf();
		}
	}

	boolean treeBack() { // Erkennt ob ein Baum hinter Kara ist
		kara.turnRight();
		boolean libtreeBack = kara.treeRight();
		kara.turnLeft();
		return libtreeBack;
	}
}

 /* Neue Befehle:	! Daten in "" müssen ersetzt werden, die "" fallen weg. !
	
	walk("zu laufende Länge"); // Kara läuft in eine Richtung, die Anzahl der Schritte wird in der Klammer angegeben.

	toTree(); // Kara läuf bis er auf einen Baum stößt.

	turnAround(); // Kara dreht sich um 180°.

	turnRight("Anzahl der Drehungen"); // Kara dreht sich nach rechts, die Anzhl der Drehunge wird in der Klammer angegeben.

	turnLeft("Anzahl der Drehungen"); // Kara dreht sich nach links, die Anzhl der Drehunge wird in der Klammer angegeben.

	invertLeaf(); // Kara invertiert das Blatt unter ihm (oder doch ihr?).

	Neue Sensoren:	! Output: true oder false	!

	treeBack(); // Gibt true zurück wenn sich hinter Kara ein Baum befindet sonnst wird false ausgegeben.

  */
