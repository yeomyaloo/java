package javaStandard;

interface Repairable {}

class scv extends Groundunit implements Repairable{
	//
}
class Tank extends Groundunit implements Repairable{
	//
}

class Dropship extends Groundunit implements Repairable{
	//
}

void repair(Repairable r) {
	if (r instanceof unit) {
		Unit u = (unit)r;
		while(u.hitPoint!=u.MAX_HP) {
			u.hitPoint++; //유닛의 HP를 증가시킨다
		}
	}
}//repair(Repairable r)