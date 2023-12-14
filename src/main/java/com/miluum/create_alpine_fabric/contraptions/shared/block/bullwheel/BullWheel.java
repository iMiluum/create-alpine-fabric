package com.miluum.create_alpine_fabric.contraptions.shared.block.bullwheel;

import com.simibubi.create.content.kinetics.base.KineticBlock;
import io.github.fabricators_of_create.porting_lib.util.IPlantable;
import io.github.fabricators_of_create.porting_lib.util.ToolAction;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.BlockRenderView;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class BullWheel extends KineticBlock {
    public BullWheel(Settings properties) {
        super(properties);
    }

    @Override
    public Direction.Axis getRotationAxis(BlockState state) {
        return null;
    }

    @Override
    public SpeedLevel getMinimumRequiredSpeedLevel() {
        return super.getMinimumRequiredSpeedLevel();
    }

    @Override
    public boolean hideStressImpact() {
        return super.hideStressImpact();
    }

    @Override
    public boolean showCapacityWithAnnotation() {
        return super.showCapacityWithAnnotation();
    }

    @Override
    public ActionResult onWrenched(BlockState state, ItemUsageContext context) {
        return super.onWrenched(state, context);
    }

    @Override
    public BlockState updateAfterWrenched(BlockState newState, ItemUsageContext context) {
        return super.updateAfterWrenched(newState, context);
    }

    @Override
    public ActionResult onSneakWrenched(BlockState state, ItemUsageContext context) {
        return super.onSneakWrenched(state, context);
    }

    @Override
    public void playRemoveSound(World world, BlockPos pos) {
        super.playRemoveSound(world, pos);
    }

    @Override
    public void playRotateSound(World world, BlockPos pos) {
        super.playRotateSound(world, pos);
    }

    @Override
    public BlockState getRotatedBlockState(BlockState originalState, Direction targetedFace) {
        return super.getRotatedBlockState(originalState, targetedFace);
    }

    @Override
    public boolean canSustainPlant(BlockState state, BlockView world, BlockPos pos, Direction facing, IPlantable plantable) {
        return super.canSustainPlant(state, world, pos, facing, plantable);
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, ItemUsageContext context, ToolAction toolAction, boolean simulate) {
        return super.getToolModifiedState(state, context, toolAction, simulate);
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, World world, BlockPos pos, PlayerEntity player, ItemStack stack, ToolAction toolAction) {
        return super.getToolModifiedState(state, world, pos, player, stack, toolAction);
    }

    @Override
    public BlockState getStateAtViewpoint(BlockState state, BlockView level, BlockPos pos, Vec3d viewpoint) {
        return super.getStateAtViewpoint(state, level, pos, viewpoint);
    }

    @Override
    public boolean hidesNeighborFace(BlockView level, BlockPos pos, BlockState state, BlockState neighborState, Direction dir) {
        return super.hidesNeighborFace(level, pos, state, neighborState, dir);
    }

    @Override
    public boolean supportsExternalFaceHiding(BlockState state) {
        return super.supportsExternalFaceHiding(state);
    }

    @Override
    public BlockState getAppearance(BlockState state, BlockRenderView renderView, BlockPos pos, Direction side, @Nullable BlockState sourceState, @Nullable BlockPos sourcePos) {
        return super.getAppearance(state, renderView, pos, side, sourceState, sourcePos);
    }
}
