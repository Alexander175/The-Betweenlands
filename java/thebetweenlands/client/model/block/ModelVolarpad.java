package thebetweenlands.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * BLVolarpad - TripleHeadedSheep
 * Created using Tabula 4.1.1
 */
public class ModelVolarpad extends ModelBase {
	public ModelRenderer stalk1;
	public ModelRenderer roots;
	public ModelRenderer stalk2;
	public ModelRenderer stalk3;
	public ModelRenderer stalk4;
	public ModelRenderer moss3;
	public ModelRenderer stalk5;
	public ModelRenderer pad1;
	public ModelRenderer pad1a;
	public ModelRenderer pad1b;
	public ModelRenderer pad1al;
	public ModelRenderer pad1ar;
	public ModelRenderer moss2;
	public ModelRenderer pad1c;
	public ModelRenderer pad1bl;
	public ModelRenderer pad1br;
	public ModelRenderer pad1dl;
	public ModelRenderer pad1dr;
	public ModelRenderer pad1bl2;
	public ModelRenderer pad1br2;
	public ModelRenderer pad1dl2;
	public ModelRenderer pad1el;
	public ModelRenderer pad1fl;
	public ModelRenderer pad1gl;
	public ModelRenderer pad1hl;
	public ModelRenderer pad1dr2;
	public ModelRenderer pad1er;
	public ModelRenderer pad1fr;
	public ModelRenderer pad1gr;
	public ModelRenderer pad1hr;
	public ModelRenderer pad1al2;
	public ModelRenderer moss1;
	public ModelRenderer pad1ar2;

	public ModelVolarpad() {
		this.textureWidth = 256;
		this.textureHeight = 128;
		this.moss2 = new ModelRenderer(this, 110, 25);
		this.moss2.setRotationPoint(6.0F, 0.0F, 0.0F);
		this.moss2.addBox(0.0F, 0.0F, -6.0F, 0, 22, 12, 0.0F);
		this.setRotateAngle(moss2, 0.0F, -0.5918411493512771F, 0.0F);
		this.stalk5 = new ModelRenderer(this, 52, 0);
		this.stalk5.setRotationPoint(0.0F, -9.8F, 0.0F);
		this.stalk5.addBox(-1.5F, -7.0F, -1.5F, 3, 7, 3, 0.0F);
		this.setRotateAngle(stalk5, 0.091106186954104F, 0.0F, 0.0F);
		this.pad1dl2 = new ModelRenderer(this, 0, 77);
		this.pad1dl2.setRotationPoint(-13.9F, 0.0F, 0.0F);
		this.pad1dl2.addBox(-2.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F);
		this.setRotateAngle(pad1dl2, 0.0F, 0.0F, -0.045553093477052F);
		this.stalk3 = new ModelRenderer(this, 26, 0);
		this.stalk3.setRotationPoint(0.0F, -9.8F, 0.0F);
		this.stalk3.addBox(-1.5F, -10.0F, -1.5F, 3, 10, 3, 0.0F);
		this.setRotateAngle(stalk3, 0.091106186954104F, 0.0F, 0.0F);
		this.pad1ar = new ModelRenderer(this, 77, 50);
		this.pad1ar.setRotationPoint(14.9F, 0.0F, 0.0F);
		this.pad1ar.addBox(0.0F, -1.0F, -13.0F, 2, 1, 13, 0.0F);
		this.setRotateAngle(pad1ar, 0.0F, 0.0F, 0.045553093477052F);
		this.pad1b = new ModelRenderer(this, 0, 35);
		this.pad1b.setRotationPoint(0.0F, 0.0F, -0.1F);
		this.pad1b.addBox(-15.0F, -1.0F, 0.0F, 30, 1, 9, 0.0F);
		this.setRotateAngle(pad1b, -0.045553093477052F, 0.0F, 0.0F);
		this.stalk2 = new ModelRenderer(this, 13, 0);
		this.stalk2.setRotationPoint(0.0F, -9.8F, 0.0F);
		this.stalk2.addBox(-1.5F, -10.0F, -1.5F, 3, 10, 3, 0.0F);
		this.setRotateAngle(stalk2, 0.091106186954104F, 0.0F, 0.0F);
		this.pad1bl2 = new ModelRenderer(this, 46, 65);
		this.pad1bl2.setRotationPoint(-2.0F, 0.0F, 0.0F);
		this.pad1bl2.addBox(-2.0F, -1.0F, 0.0F, 2, 1, 9, 0.0F);
		this.pad1hr = new ModelRenderer(this, 13, 104);
		this.pad1hr.setRotationPoint(0.0F, 0.0F, 1.9F);
		this.pad1hr.addBox(0.0F, -1.0F, 0.0F, 4, 1, 2, 0.0F);
		this.setRotateAngle(pad1hr, -0.045553093477052F, 0.0F, 0.0F);
		this.pad1br = new ModelRenderer(this, 23, 54);
		this.pad1br.setRotationPoint(14.9F, 0.0F, 0.0F);
		this.pad1br.addBox(0.0F, -1.0F, 0.0F, 2, 1, 9, 0.0F);
		this.setRotateAngle(pad1br, 0.0F, 0.0F, 0.045553093477052F);
		this.pad1dr2 = new ModelRenderer(this, 13, 77);
		this.pad1dr2.setRotationPoint(13.9F, 0.0F, 0.0F);
		this.pad1dr2.addBox(0.0F, -1.0F, 0.0F, 2, 1, 4, 0.0F);
		this.setRotateAngle(pad1dr2, 0.0F, 0.0F, 0.045553093477052F);
		this.pad1a = new ModelRenderer(this, 0, 46);
		this.pad1a.setRotationPoint(0.0F, 0.0F, -14.9F);
		this.pad1a.addBox(-13.0F, -1.0F, -2.0F, 26, 1, 2, 0.0F);
		this.setRotateAngle(pad1a, 0.091106186954104F, 0.0F, 0.0F);
		this.pad1bl = new ModelRenderer(this, 0, 54);
		this.pad1bl.setRotationPoint(-14.9F, 0.0F, 0.0F);
		this.pad1bl.addBox(-2.0F, -1.0F, 0.0F, 2, 1, 9, 0.0F);
		this.setRotateAngle(pad1bl, 0.0F, 0.0F, -0.045553093477052F);
		this.pad1ar2 = new ModelRenderer(this, 23, 65);
		this.pad1ar2.setRotationPoint(2.0F, 0.0F, 0.0F);
		this.pad1ar2.addBox(0.0F, -1.0F, -9.0F, 2, 1, 9, 0.0F);
		this.pad1 = new ModelRenderer(this, 0, 18);
		this.pad1.setRotationPoint(0.0F, -7.0F, 0.0F);
		this.pad1.addBox(-15.0F, -1.0F, -15.0F, 30, 1, 15, 0.0F);
		this.pad1gr = new ModelRenderer(this, 21, 100);
		this.pad1gr.setRotationPoint(0.0F, 0.0F, 2.0F);
		this.pad1gr.addBox(0.0F, -1.0F, 0.0F, 8, 1, 2, 0.0F);
		this.stalk1 = new ModelRenderer(this, 0, 0);
		this.stalk1.setRotationPoint(0.0F, 24.0F, -4.0F);
		this.stalk1.addBox(-1.5F, -10.0F, -1.5F, 3, 14, 3, 0.0F);
		this.setRotateAngle(stalk1, -0.36425021489121656F, 0.0F, 0.0F);
		this.moss1 = new ModelRenderer(this, 110, 0);
		this.moss1.setRotationPoint(-0.1F, 0.0F, -0.1F);
		this.moss1.addBox(-2.0F, -1.0F, -9.0F, 0, 18, 18, 0.0F);
		this.setRotateAngle(moss1, 0.0F, 0.0F, 0.045553093477052F);
		this.pad1el = new ModelRenderer(this, 0, 90);
		this.pad1el.setRotationPoint(-2.0F, 0.0F, 4.0F);
		this.pad1el.addBox(-12.0F, -1.0F, 0.0F, 12, 1, 4, 0.0F);
		this.pad1er = new ModelRenderer(this, 33, 90);
		this.pad1er.setRotationPoint(2.0F, 0.0F, 4.0F);
		this.pad1er.addBox(0.0F, -1.0F, 0.0F, 12, 1, 4, 0.0F);
		this.pad1br2 = new ModelRenderer(this, 69, 65);
		this.pad1br2.setRotationPoint(2.0F, 0.0F, 0.0F);
		this.pad1br2.addBox(0.0F, -1.0F, 0.0F, 2, 1, 9, 0.0F);
		this.moss3 = new ModelRenderer(this, 110, 0);
		this.moss3.setRotationPoint(0.4F, -10.0F, -0.5F);
		this.moss3.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
		this.setRotateAngle(moss3, 0.18203784098300857F, 0.0F, 0.0F);
		this.pad1gl = new ModelRenderer(this, 0, 100);
		this.pad1gl.setRotationPoint(0.0F, 0.0F, 2.0F);
		this.pad1gl.addBox(-8.0F, -1.0F, 0.0F, 8, 1, 2, 0.0F);
		this.pad1dl = new ModelRenderer(this, 37, 83);
		this.pad1dl.setRotationPoint(-1.0F, 0.0F, 8.9F);
		this.pad1dl.addBox(-14.0F, -1.0F, 0.0F, 14, 1, 4, 0.0F);
		this.setRotateAngle(pad1dl, -0.045553093477052F, 0.0F, 0.0F);
		this.pad1hl = new ModelRenderer(this, 0, 104);
		this.pad1hl.setRotationPoint(0.0F, 0.0F, 1.9F);
		this.pad1hl.addBox(-4.0F, -1.0F, 0.0F, 4, 1, 2, 0.0F);
		this.setRotateAngle(pad1hl, -0.045553093477052F, 0.0F, 0.0F);
		this.roots = new ModelRenderer(this, 127, 0);
		this.roots.setRotationPoint(0.0F, 12.5F, 0.0F);
		this.roots.addBox(-1.5F, 0.0F, -1.5F, 3, 13, 3, 0.0F);
		this.setRotateAngle(roots, 0.091106186954104F, -0.091106186954104F, 0.18203784098300857F);
		this.pad1fr = new ModelRenderer(this, 25, 96);
		this.pad1fr.setRotationPoint(0.0F, 0.0F, 3.9F);
		this.pad1fr.addBox(0.0F, -1.0F, 0.0F, 10, 1, 2, 0.0F);
		this.setRotateAngle(pad1fr, -0.045553093477052F, 0.0F, 0.0F);
		this.pad1fl = new ModelRenderer(this, 0, 96);
		this.pad1fl.setRotationPoint(0.0F, 0.0F, 3.9F);
		this.pad1fl.addBox(-10.0F, -1.0F, 0.0F, 10, 1, 2, 0.0F);
		this.setRotateAngle(pad1fl, -0.045553093477052F, 0.0F, 0.0F);
		this.pad1al = new ModelRenderer(this, 46, 50);
		this.pad1al.setRotationPoint(-14.9F, 0.0F, 0.0F);
		this.pad1al.addBox(-2.0F, -1.0F, -13.0F, 2, 1, 13, 0.0F);
		this.setRotateAngle(pad1al, 0.0F, 0.0F, -0.045553093477052F);
		this.pad1dr = new ModelRenderer(this, 0, 83);
		this.pad1dr.setRotationPoint(1.0F, 0.0F, 8.9F);
		this.pad1dr.addBox(0.0F, -1.0F, 0.0F, 14, 1, 4, 0.0F);
		this.setRotateAngle(pad1dr, -0.045553093477052F, 0.0F, 0.0F);
		this.pad1c = new ModelRenderer(this, 0, 50);
		this.pad1c.setRotationPoint(0.0F, 0.0F, -2.0F);
		this.pad1c.addBox(-9.0F, -1.0F, -2.0F, 18, 1, 2, 0.0F);
		this.pad1al2 = new ModelRenderer(this, 0, 65);
		this.pad1al2.setRotationPoint(-2.0F, 0.0F, 0.0F);
		this.pad1al2.addBox(-2.0F, -1.0F, -9.0F, 2, 1, 9, 0.0F);
		this.stalk4 = new ModelRenderer(this, 39, 0);
		this.stalk4.setRotationPoint(0.0F, -9.8F, 0.0F);
		this.stalk4.addBox(-1.5F, -10.0F, -1.5F, 3, 10, 3, 0.0F);
		this.setRotateAngle(stalk4, 0.091106186954104F, 0.0F, 0.0F);
		this.pad1.addChild(this.moss2);
		this.stalk4.addChild(this.stalk5);
		this.pad1dl.addChild(this.pad1dl2);
		this.stalk2.addChild(this.stalk3);
		this.pad1.addChild(this.pad1ar);
		this.pad1.addChild(this.pad1b);
		this.stalk1.addChild(this.stalk2);
		this.pad1bl.addChild(this.pad1bl2);
		this.pad1gr.addChild(this.pad1hr);
		this.pad1b.addChild(this.pad1br);
		this.pad1dr.addChild(this.pad1dr2);
		this.pad1.addChild(this.pad1a);
		this.pad1b.addChild(this.pad1bl);
		this.pad1ar.addChild(this.pad1ar2);
		this.stalk5.addChild(this.pad1);
		this.pad1fr.addChild(this.pad1gr);
		this.pad1al2.addChild(this.moss1);
		this.pad1dl.addChild(this.pad1el);
		this.pad1dr.addChild(this.pad1er);
		this.pad1br.addChild(this.pad1br2);
		this.stalk3.addChild(this.moss3);
		this.pad1fl.addChild(this.pad1gl);
		this.pad1b.addChild(this.pad1dl);
		this.pad1gl.addChild(this.pad1hl);
		this.pad1er.addChild(this.pad1fr);
		this.pad1el.addChild(this.pad1fl);
		this.pad1.addChild(this.pad1al);
		this.pad1b.addChild(this.pad1dr);
		this.pad1a.addChild(this.pad1c);
		this.pad1al.addChild(this.pad1al2);
		this.stalk3.addChild(this.stalk4);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.stalk1.render(f5);
		this.roots.render(f5);
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	 public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
