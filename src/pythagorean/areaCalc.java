/*    */ package pythagorean;
/*    */ 
/*    */ import javax.swing.JOptionPane;
/*    */ 
/*    */ public class areaCalc
/*    */ {
/*    */   public void rTheorem()
/*    */   {
/* 22 */     String a = JOptionPane.showInputDialog("Type in the height");
/* 23 */     String b = JOptionPane.showInputDialog("Type in the base");
/*    */ 
/* 25 */     double a2 = Float.parseFloat(a);
/* 26 */     double b2 = Float.parseFloat(b);
/* 29 */     double c2 = a2 * b2;
/* 30 */     double cS = c2 / 2;
/*    */ 
/* 33 */     JOptionPane.showMessageDialog(null, "Area is equal to " + cS, "Area Triangle", -1);
/*    */ 
/* 35 */     menu selMethod = new menu();
/* 36 */     selMethod.menuMethod();
/*    */   }
/*    */   public void uTheorem() {
	/* 39 */     String a = JOptionPane.showInputDialog("Type in the length");
	/* 40 */     String b = JOptionPane.showInputDialog("Type in the heigth");
	/*    */ 
	/* 42 */     double a2 = Float.parseFloat(a);
	/* 43 */     double b2 = Float.parseFloat(b);
	/* 46 */     double c2 = a2 * b2;
	/*    */ 
	/* 51 */     JOptionPane.showMessageDialog(null, "Area is equal to " + c2, "Area Square/Rectangle", -1);
	/*    */ 
	/* 53 */     menu selMethod = new menu();
	/* 54 */     selMethod.menuMethod();
	/*    */   }
public void irTheorem() { //ir is inverted rounded, for calculating A or B
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

public void iuTheorem() { //iu is inverted unrounded, for calculating A or B
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
public void iraTheorem() { //ir is inverted rounded, for calculating A or B
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

public void iuaTheorem() { //iu is inverted unrounded, for calculating A or B
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