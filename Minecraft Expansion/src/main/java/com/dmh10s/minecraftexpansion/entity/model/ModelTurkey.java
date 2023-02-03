package com.dmh10s.minecraftexpansion.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelChicken - Either Mojang or a mod author
 * Created using Tabula 6.0.0
 */

public class ModelTurkey extends ModelBase {
    public ModelRenderer LeftLeg;
    public ModelRenderer Head;
    public ModelRenderer Body;
    public ModelRenderer RightLeg;
    public ModelRenderer Wattle;
    public ModelRenderer Beak;
    public ModelRenderer LeftTailFeather;
    public ModelRenderer LeftMiddleTailFeather;
    public ModelRenderer MiddleTailFeather;
    public ModelRenderer RightMiddleTailFeather;
    public ModelRenderer RightTailFeather;

    public ModelTurkey() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, 15.0F, -4.0F);
        this.Head.addBox(-2.0F, -6.0F, -2.0F, 4, 6, 3, 0.0F);
        this.RightLeg = new ModelRenderer(this, 26, 0);
        this.RightLeg.setRotationPoint(-2.0F, 19.0F, 1.0F);
        this.RightLeg.addBox(-1.0F, 0.0F, -3.0F, 3, 5, 3, 0.0F);
        this.LeftLeg = new ModelRenderer(this, 26, 0);
        this.LeftLeg.setRotationPoint(1.0F, 19.0F, 1.0F);
        this.LeftLeg.addBox(-1.0F, 0.0F, -3.0F, 3, 5, 3, 0.0F);
        this.RightMiddleTailFeather = new ModelRenderer(this, 40, 0);
        this.RightMiddleTailFeather.setRotationPoint(0.0F, 4.0F, 2.6F);
        this.RightMiddleTailFeather.addBox(0.0F, 0.0F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(RightMiddleTailFeather, 0.0F, 0.4363323129985824F, 0.0F);
        this.LeftTailFeather = new ModelRenderer(this, 40, 0);
        this.LeftTailFeather.setRotationPoint(-2.0F, 4.0F, 1.0F);
        this.LeftTailFeather.addBox(0.0F, 0.0F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(LeftTailFeather, 0.0F, -0.8726646259971648F, 0.0F);
        this.Wattle = new ModelRenderer(this, 14, 4);
        this.Wattle.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Wattle.addBox(-1.0F, -2.0F, -3.0F, 2, 2, 2, 0.0F);
        this.Body = new ModelRenderer(this, 0, 9);
        this.Body.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.Body.addBox(-3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F);
        this.setRotateAngle(Body, 1.5707963267948966F, 0.0F, 0.0F);
        this.MiddleTailFeather = new ModelRenderer(this, 40, 0);
        this.MiddleTailFeather.setRotationPoint(-1.0F, 4.0F, 2.5F);
        this.MiddleTailFeather.addBox(0.0F, 0.0F, 0.0F, 2, 1, 6, 0.0F);
        this.RightTailFeather = new ModelRenderer(this, 40, 0);
        this.RightTailFeather.setRotationPoint(1.0F, 4.0F, 2.3F);
        this.RightTailFeather.addBox(0.0F, 0.0F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(RightTailFeather, 0.0F, 0.8726646259971648F, 0.0F);
        this.Beak = new ModelRenderer(this, 14, 0);
        this.Beak.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Beak.addBox(-2.0F, -4.0F, -4.0F, 4, 2, 2, 0.0F);
        this.LeftMiddleTailFeather = new ModelRenderer(this, 40, 0);
        this.LeftMiddleTailFeather.setRotationPoint(-1.8F, 4.0F, 1.9F);
        this.LeftMiddleTailFeather.addBox(0.0F, 0.0F, 0.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(LeftMiddleTailFeather, 0.0F, -0.4363323129985824F, 0.0F);
        this.Body.addChild(this.RightMiddleTailFeather);
        this.Body.addChild(this.LeftTailFeather);
        this.Head.addChild(this.Wattle);
        this.Body.addChild(this.MiddleTailFeather);
        this.Body.addChild(this.RightTailFeather);
        this.Head.addChild(this.Beak);
        this.Body.addChild(this.LeftMiddleTailFeather);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	if (this.isChild)
        {
            float f6 = 2.0F;
            GlStateManager.pushMatrix();
            GlStateManager.translate(0.0F, 5.0F * f5, 2.0F * f5);
            this.Head.render(f5);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.scale(0.5F, 0.5F, 0.5F);
            GlStateManager.translate(0.0F, 24.0F * f5, 0.0F);
            this.RightLeg.render(f5);
            this.LeftLeg.render(f5);
            this.Body.render(f5);
            GlStateManager.popMatrix();
        }
        else
        {
        	this.Head.render(f5);
            this.RightLeg.render(f5);
            this.LeftLeg.render(f5);
            this.Body.render(f5);
        }
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
    	this.LeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.RightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	
    	this.Head.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.Head.rotateAngleX = headPitch * 0.017453292F;
    }
}
