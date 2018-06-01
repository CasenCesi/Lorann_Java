package motionless;

public abstract class MotionlessElementFactory {
	
	private static final Bone bone = new Bone();
	
	private static final Door_Closed gate_c = new Door_Closed();
	
	private static final Door_Opened gate_o = new Door_Opened();
	
	private static final Energy energie = new Energy();
	
	private static final Horizontal_Bone bone_h = new Horizontal_Bone();
	
	private static final floor Floor = new floor();
	
	private static final Purse purse = new Purse();
	
	private static final Vertical_Bone bone_v = new Vertical_Bone();
	
	private static MotionlessElement[] motionlessElements = {
			bone,
			gate_c,
			gate_o,
			energie,
			bone_h,
			Floor,
			purse,
			bone_v,
	};
	
	public static MotionlessElement createBone() {return bone;}
	
	public static MotionlessElement createGateC() {return gate_c;}
	
	public static MotionlessElement createGateo() {return gate_o;}
	
	public static MotionlessElement createEnergie() {return energie;}
	
	public static MotionlessElement createBoneH() {return bone_h;}
	
	public static MotionlessElement createBoneV() {return bone_v;}
	
	public static MotionlessElement createPurse() {return purse;}
	
	public static MotionlessElement createFloor() {return Floor;}
	
	public static MotionlessElement getFromFileSymbol(final char fileSymbol) {
        for (final MotionlessElement motionlessElement : motionlessElements) {
            if (motionlessElement.getSprite().getConsoleImage() == fileSymbol) {
                return motionlessElement;
            }
        }
        return Floor;
	}
}
