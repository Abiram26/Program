/*    */ package pythagorean;
/*    */ 
/*    */ import javax.swing.JOptionPane;
/*    */ 
/*    */ public class roundedTheorem
/*    */ {
/*    */   public void rTheorem()
/*    */   {
/* 22 */     String a = JOptionPane.showInputDialog("Type in A");
/* 23 */     String b = JOptionPane.showInputDialog("Type in B");
/*    */ 
/* 25 */     double a2 = Float.parseFloat(a);
/* 26 */     double b2 = Float.parseFloat(b);
/* 27 */     double aS = Math.pow(a2, 2.0D);
/* 28 */     double bS = Math.pow(b2, 2.0D);
/* 29 */     double c2 = aS + bS;
/* 30 */     double cS = Math.pow(c2, 0.5);
/* 31 */     double cR = Math.round(cS);
/*    */ 
/* 33 */     JOptionPane.showMessageDialog(null, "C is equal to " + cR, "Rounded Pythagorean's Theorem", -1);
/*    */ 
/* 35 */     menu selMethod = new menu();
/* 36 */     selMethod.menuMethod();
/*    */   }
/*    */   public void uTheorem() {
	/* 39 */     String a = JOptionPane.showInputDialog("Type in A");
	/* 40 */     String b = JOptionPane.showInputDialog("Type in B");
	/*    */ 
	/* 42 */     double a2 = Float.parseFloat(a);
	/* 43 */     double b2 = Float.parseFloat(b);
	/* 44 */     double aS = Math.pow(a2, 2.0D);
	/* 45 */     double bS = Math.pow(b2, 2.0D);
	/* 46 */     double c2 = aS + bS;
	/* 47 */     double cS = Math.pow(c2, 0.5);
	/*    */ 
	/* 51 */     JOptionPane.showMessageDialog(null, "C is equal to " + cS, "Unrounded Pythagorean's Theorem", -1);
	/*    */ 
	/* 53 */     menu selMethod = new menu();
	/* 54 */     selMethod.menuMethod();
	/*    */   }
public void irTheorem() { //ir is inverted rounded, for calculating A or B
	/* 39 */     String a = JOptionPane.showInputDialog("Type in B");
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
	/* 51 */     JOptionPane.showMessageDialog(null, "A is equal to " + cR, "Rounded Pythagorean's Theorem", -1);
	/*    */ 
	/* 53 */     menu selMethod = new menu();
	/* 54 */     selMethod.menuMethod();
	/*    */   }

public void iuTheorem() { //iu is inverted unrounded, for calculating A or B
	/* 39 */     String a = JOptionPane.showInputDialog("Type in B");
	/* 40 */     String b = JOptionPane.showInputDialog("Type in Hypotenuse/C");
	/*    */ 
	/* 42 */     double a2 = Float.parseFloat(a);
	/* 43 */     double b2 = Float.parseFloat(b);
	/* 44 */     double aS = Math.pow(a2, 2.0D);
	/* 45 */     double bS = Math.pow(b2, 2.0D);
	/* 46 */     double c2 = bS - aS;
	/* 47 */     double cS = Math.pow(c2, 0.5);
	/*    */ 
	/* 51 */     JOptionPane.showMessageDialog(null, "A is equal to " + cS, "Unrounded Pythagorean's Theorem", -1);
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