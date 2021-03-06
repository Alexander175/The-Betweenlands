package thebetweenlands.client.audio;

import net.minecraft.client.audio.MovingSound;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import thebetweenlands.client.event.AmbienceSoundPlayHandler;
import thebetweenlands.lib.ModInfo;

public class AmbienceCaveSound
        extends MovingSound
{
    private EntityPlayer player;

    public AmbienceCaveSound(EntityPlayer entityPlayer) {
        super(new ResourceLocation("thebetweenlands:ambientCave"));
        this.player = entityPlayer;
        this.repeat = true;
        this.field_147666_i = AttenuationType.NONE;
        this.volume = 0.1F;
    }

    @Override
    public void update() {
        if( this.player.dimension != ModInfo.DIMENSION_ID || this.player.posY >= AmbienceSoundPlayHandler.CAVE_START ) {
            if( this.volume > 0.05F ) {
                this.volume -= 0.02F;
                if( this.volume < 0.05F ) {
                    this.volume = 0.05F;
                }
            } else {
                this.donePlaying = true;
            }
        } else {
            if( this.volume < 1.0F ) {
                this.volume += 0.02F;
                if( this.volume > 1.0F ) {
                    this.volume = 1.0F;
                }
            }
        }
    }

    public void stop() {
        this.donePlaying = true;
    }
}
