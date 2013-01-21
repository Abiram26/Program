/*    */ package pythagorean;
/*    */ 
/*    */ import javax.swing.JOptionPane;
/*    */ 
/*    */ public class latsurCalc // This is the class.
/*    */ {
/*    */   public void calcPrism() // This is the 'void' (in the menu you should redirect to this void)
/*    */   {
/* 22 */     String a = JOptionPane.showInputDialog("Type in the length");
/* 23 */     String b = JOptionPane.showInputDialog("Type in the width");
			 String c = JOptionPane.showInputDialog("Type in the height");
			
/* 25 */     double a2 = Float.parseFloat(a);
/* 26 */     double b2 = Float.parseFloat(b);
			 double c2 = Float.parseFloat(c);
/* 29 */     double cP1 = a2 * b2 * 2;
			 double cP2 = a2 * c2 * 2;
			 double cP3 = b2 * c2 * 2;
/* 30 */     double cS = cP1 + cP2 + cP3; 
/*    */ 							// Formula = (l*w*2) + (l*h*2) + (w*h*2)
/* 33 */     JOptionPane.showMessageDialog(null, "Area is equal to " + cS, "Area Rectangular Prism", -1);
/*    */ 
/* 35 */     menu selMethod = new menu();
/* 36 */     selMethod.menuMethod();
/*    */   }
/*    */   public void calcPyramid() { // This is the 'void' (in the menu you should redirect to this void)
	/* 39 */     String a = JOptionPane.showInputDialog("Type in the length of the base square/rectangle");
				 String c = JOptionPane.showInputDialog("Type in the width of the base square/rectangle");
	/* 40 */     String b = JOptionPane.showInputDialog("Type in the height");
	/*    */ 
	/* 42 */     double a2 = Float.parseFloat(a); //length
	/* 43 */     double b2 = Float.parseFloat(b); //height
				 double c2 = Float.parseFloat(c); //width
				 double cS = a2 * c2; // Add this at the end
			     double p1 = Math.pow(b2, 2);
			     double L5 = a2 /2; // Length divided by 2 ( or *0.5)
			     double W5 = c2 /2; // Width divided by 2 ( or *0.5)
			     double pa1 = Math.pow(L5, 2);
			     double pa2 = Math.pow(W5, 2);
			     double pb1 = p1 + pa2;
			     double pb2 = p1 + pa1;
			     double pc1 = Math.pow(pb1, 0.5);
			     double pc2 = Math.pow(pb2, 0.5);
			     double pd1 = pc1 * a2;
			     double pd2 = pc2 * c2;
	/* 46 */     double cA = pd1 + pd2 + cS;
	/*    */ 
	/* 51 */     JOptionPane.showMessageDialog(null, "Area is equal to " + cA, "Area Pyramid", -1);
	/*    */ 
	/* 53 */     menu selMethod = new menu();
	/* 54 */     selMethod.menuMethod();
	/*    */   }
public void calcSqr() { //ir is inverted rounded, for calculating A or B
	/* 39 */     String a = JOptionPane.showInputDialog("Type in the diameter");
	/*    */ 
	/* 42 */     double a2 = Float.parseFloat(a);
	/* 43 */     double b2 = 3.1415926535897932384;
				 double cP = a2 / 2;
	/* 46 */     double c2 = Math.pow(cP, 2);
	/* 47 */     double cS = b2 * c2;
	/*    */ 
	/* 51 */     JOptionPane.showMessageDialog(null, "Area is equal to " + cS, "Area Circle using Diameter", -1);
	/*    */ 
	/* 53 */     menu selMethod = new menu();
	/* 54 */     selMethod.menuMethod();
	/*    */   }

public void calcPow() { //iu is inverted unrounded, for calculating A or B
	/* 39 */     String a = JOptionPane.showInputDialog("Type in the radius");
	/*    */ 
	/* 42 */     double a2 = Float.parseFloat(a);
	/* 43 */     double b2 = 3.1415926535897932384;
	/* 46 */     double c2 = Math.pow(a2, 2);
	/* 47 */     double cS = b2 * c2;
	/*    */ 
	/* 51 */     JOptionPane.showMessageDialog(null, "Area is equal to " + cS, "Area Circle using Radius", -1);
	/*    */ 
	/* 53 */     menu selMethod = new menu();
	/* 54 */     selMethod.menuMethod();
	/*    */   }
public void calcMul() { //ir is inverted rounded, for calculating A or B
	/* 39 */     String a = JOptionPane.showInputDialog("Type in A");
	/* 40 */     String b = JOptionPane.showInputDialog("Type in Hypotenuse/C");
	/*    */ 
	/* 42 */     double a2 = Float.parseFloat(a);
	/* 43 */     double b2 = Float.parseFloat(b);
	/* 44 */     double aS = Math.pow(a2, 2.0D);
	/* 45 */     double bS = Math.pow(b2, 2.0D);
	/* 46 */     double c2 = bS - aS;
	/* 47 */     double cS = Math.pow(c2, 0.5);
	             double cR = Math.round(cS);
	/*    */ 
	/* 51 */     JOptionPane.showMessageDialog(null, "B is equal to " + cR, "Rounded Pythagorean's Theorem", -1);
	/*    */ 
	/* 53 */     menu selMethod = new menu();
	/* 54 */     selMethod.menuMethod();
	/*    */   }

public void calcDiv() { //iu is inverted unrounded, for calculating A or B
	/* 39 */     String a = JOptionPane.showInputDialog("Type in A");
	/* 40 */     String b = JOptionPane.showInputDialog("Type in Hypotenuse/C");
	/*    */ 
	/* 42 */     double a2 = Float.parseFloat(a);
	/* 43 */     double b2 = Float.parseFloat(b);
	/* 44 */     double aS = Math.pow(a2, 2.0D);
	/* 45 */     double bS = Math.pow(b2, 2.0D);
	/* 46 */     double c2 = bS - aS;
	/* 47 */     double cS = Math.pow(c2, 0.5);
	/*    */ 
	/* 51 */     JOptionPane.showMessageDialog(null, "B is equal to " + cS, "Unrounded Pythagorean's Theorem", -1);
	/*    */ 
	/* 53 */     menu selMethod = new menu();
	/* 54 */     selMethod.menuMethod();
	/*    */   }
/*    */ }

/* Location:           C:\A\Math App\Geometry Calculator-ALPHA-0.4.4.jar
 * Qualified Name:     pythagorean.roundedTheorem
 * JD-Core Version:    0.6.2
 */