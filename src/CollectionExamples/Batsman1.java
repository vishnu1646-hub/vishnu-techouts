package CollectionExamples;

public class Batsman1 {
	String name;
	int runsScored;
	int centuries;
	int halfCenturies;
	int ballsFaced;
	int fours;
	int sixes;
	public void setData(String name,int runScored,int centuries,int halfCenturies,int ballsFaced,int fours,int sixes){
      this.name=name;
      this.runsScored=runScored;
      this.centuries=centuries;
      this.halfCenturies=halfCenturies;
      this.ballsFaced=ballsFaced;
      this.fours=fours;
      this.sixes=sixes;
	}
	public float getStrikeRate(){
		return (this.runsScored*100)/this.ballsFaced;
	}
	public int getRunsScoredInBoundaries() {
		return (4*this.fours+6*this.sixes);
	}
	
	

}
