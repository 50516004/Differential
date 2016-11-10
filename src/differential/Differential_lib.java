package differential;

public class Differential_lib implements Differential_if {
  private double a,h;

  public Differential_lib(Double a, Double h) {
	this.a = a;
	this.h = h;
}
  
 @Override
  public double getRx(){
	  return 2*this.a;
  }
 @Override
  public double getDx() {
	return (Math.pow(this.a+this.h, 2)-Math.pow(this.a, 2))/h;
  }
  public double getgosa(){
	  return Math.abs(getRx()-getDx())/getRx()*100;
  }

	
}
