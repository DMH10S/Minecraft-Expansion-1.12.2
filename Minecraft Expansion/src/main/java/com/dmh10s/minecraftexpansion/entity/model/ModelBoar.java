package com.dmh10s.minecraftexpansion.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelPig - Either Mojang or a mod author
 * Created using Tabula 6.0.0
 */
public class ModelBoar extends ModelBase {
    public ModelRenderer field_78148_b;
    public ModelRenderer field_78146_d;
    public ModelRenderer field_78144_f;
    public ModelRenderer field_78149_c;
    public ModelRenderer field_78147_e;
    public ModelRenderer field_78150_a0;
    public ModelRenderer field_78150_a1;
    public ModelRenderer shape8;
    public ModelRenderer shape9;
    protected float childYOffset = 8.0F;
    protected float childZOffset = 4.0F;

    public ModelBoar() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.field_78144_f = new ModelRenderer(this, 0, 16);
        this.field_78144_f.setRotationPoint(3.0F, 18.0F, -5.0F);
        this.field_78144_f.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.field_78149_c = new ModelRenderer(this, 0, 16);
        this.field_78149_c.setRotationPoint(-3.0F, 18.0F, 7.0F);
        this.field_78149_c.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.shape9 = new ModelRenderer(this, 52, 1);
        this.shape9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape9.addBox(-5.0F, 0.0F, -8.0F, 1, 1, 5, 0.0F);
        this.field_78150_a0 = new ModelRenderer(this, 0, 0);
        this.field_78150_a0.setRotationPoint(0.0F, 12.0F, -6.0F);
        this.field_78150_a0.addBox(-4.0F, -4.0F, -8.0F, 8, 8, 8, 0.0F);
        this.field_78150_a1 = new ModelRenderer(this, 16, 16);
        this.field_78150_a1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78150_a1.addBox(-2.0F, 0.0F, -9.0F, 4, 3, 1, 0.0F);
        this.field_78148_b = new ModelRenderer(this, 28, 8);
        this.field_78148_b.setRotationPoint(0.0F, 11.0F, 2.0F);
        this.field_78148_b.addBox(-5.0F, -10.0F, -7.0F, 10, 16, 8, 0.0F);
        this.setRotateAngle(field_78148_b, 1.5707963705062866F, 0.0F, 0.0F);
        this.field_78147_e = new ModelRenderer(this, 0, 16);
        this.field_78147_e.setRotationPoint(-3.0F, 18.0F, -5.0F);
        this.field_78147_e.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.shape8 = new ModelRenderer(this, 30, 0);
        this.shape8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape8.addBox(4.0F, 0.0F, -8.0F, 1, 1, 5, 0.0F);
        this.field_78146_d = new ModelRenderer(this, 0, 16);
        this.field_78146_d.setRotationPoint(3.0F, 18.0F, 7.0F);
        this.field_78146_d.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.field_78150_a0.addChild(this.shape9);
        this.field_78150_a0.addChild(this.field_78150_a1);
        this.field_78150_a0.addChild(this.shape8);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
    	if (this.isChild)
        {
            float f6 = 2.0F;
            GlStateManager.pushMatrix();
            GlStateManager.translate(0.0F, 5.0F * f5, 2.0F * f5);
            this.field_78150_a0.render(f5);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.scale(0.5F, 0.5F, 0.5F);
            GlStateManager.translate(0.0F, 24.0F * f5, 0.0F);
            this.field_78147_e.render(f5);
            this.field_78146_d.render(f5);
            this.field_78144_f.render(f5);
            this.field_78149_c.render(f5);
            this.field_78148_b.render(f5);
            GlStateManager.popMatrix();
        }
        else
        {
        	this.field_78148_b.render(f5);
            this.field_78147_e.render(f5);
            this.field_78146_d.render(f5);
            this.field_78150_a0.render(f5);
            this.field_78144_f.render(f5);
            this.field_78149_c.render(f5);
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
    	this.field_78144_f.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4f * limbSwingAmount;
    	this.field_78146_d.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4f * limbSwingAmount;
    	this.field_78147_e.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4f * limbSwingAmount;
    	this.field_78149_c.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4f * limbSwingAmount;
    	
    	this.field_78150_a0.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.field_78150_a0.rotateAngleX = headPitch * 0.017453292F;
    }
}
