package com.fal701.block.Z_custom;

import com.fal701.util.WcRailPlacementHelper;
import net.minecraft.block.*;
import net.minecraft.block.enums.RailShape;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WcRail extends AbstractRailBlock {


    public WcRail(boolean forbidCurves, Settings settings) {
        super(forbidCurves, settings);
        this.setDefaultState((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(SHAPE, RailShape.NORTH_SOUTH)).with(WATERLOGGED, false));

    }

    public static final EnumProperty<RailShape> SHAPE;

    protected BlockState updateBlockState(World world, BlockPos pos, BlockState state, boolean forceUpdate) {
        if (world.isClient) {
            return state;
        } else {
            RailShape railShape = (RailShape)state.get(this.getShapeProperty());
            return (new WcRailPlacementHelper(world, pos, state)).updateBlockState(world.isReceivingRedstonePower(pos), forceUpdate, railShape).getBlockState();
        }
    }

    protected void updateBlockState(BlockState state, World world, BlockPos pos, Block neighbor) {
        if (neighbor.getDefaultState().emitsRedstonePower() && (new WcRailPlacementHelper(world, pos, state)).getNeighbors().size() == 3) {
            this.updateBlockState(world, pos, state, false);
        }

    }

    public Property<RailShape> getShapeProperty() {
        return SHAPE;
    }

    public BlockState rotate(BlockState state, BlockRotation rotation) {
        switch (rotation) {
            case CLOCKWISE_180:
                switch ((RailShape)state.get(SHAPE)) {
                    case ASCENDING_EAST:
                        return (BlockState)state.with(SHAPE, RailShape.ASCENDING_WEST);
                    case ASCENDING_WEST:
                        return (BlockState)state.with(SHAPE, RailShape.ASCENDING_EAST);
                    case ASCENDING_NORTH:
                        return (BlockState)state.with(SHAPE, RailShape.ASCENDING_SOUTH);
                    case ASCENDING_SOUTH:
                        return (BlockState)state.with(SHAPE, RailShape.ASCENDING_NORTH);
                    case SOUTH_EAST:
                        return (BlockState)state.with(SHAPE, RailShape.NORTH_WEST);
                    case SOUTH_WEST:
                        return (BlockState)state.with(SHAPE, RailShape.NORTH_EAST);
                    case NORTH_WEST:
                        return (BlockState)state.with(SHAPE, RailShape.SOUTH_EAST);
                    case NORTH_EAST:
                        return (BlockState)state.with(SHAPE, RailShape.SOUTH_WEST);
                }
            case COUNTERCLOCKWISE_90:
                switch ((RailShape)state.get(SHAPE)) {
                    case ASCENDING_EAST:
                        return (BlockState)state.with(SHAPE, RailShape.ASCENDING_NORTH);
                    case ASCENDING_WEST:
                        return (BlockState)state.with(SHAPE, RailShape.ASCENDING_SOUTH);
                    case ASCENDING_NORTH:
                        return (BlockState)state.with(SHAPE, RailShape.ASCENDING_WEST);
                    case ASCENDING_SOUTH:
                        return (BlockState)state.with(SHAPE, RailShape.ASCENDING_EAST);
                    case SOUTH_EAST:
                        return (BlockState)state.with(SHAPE, RailShape.NORTH_EAST);
                    case SOUTH_WEST:
                        return (BlockState)state.with(SHAPE, RailShape.SOUTH_EAST);
                    case NORTH_WEST:
                        return (BlockState)state.with(SHAPE, RailShape.SOUTH_WEST);
                    case NORTH_EAST:
                        return (BlockState)state.with(SHAPE, RailShape.NORTH_WEST);
                    case NORTH_SOUTH:
                        return (BlockState)state.with(SHAPE, RailShape.EAST_WEST);
                    case EAST_WEST:
                        return (BlockState)state.with(SHAPE, RailShape.NORTH_SOUTH);
                }
            case CLOCKWISE_90:
                switch ((RailShape)state.get(SHAPE)) {
                    case ASCENDING_EAST:
                        return (BlockState)state.with(SHAPE, RailShape.ASCENDING_SOUTH);
                    case ASCENDING_WEST:
                        return (BlockState)state.with(SHAPE, RailShape.ASCENDING_NORTH);
                    case ASCENDING_NORTH:
                        return (BlockState)state.with(SHAPE, RailShape.ASCENDING_EAST);
                    case ASCENDING_SOUTH:
                        return (BlockState)state.with(SHAPE, RailShape.ASCENDING_WEST);
                    case SOUTH_EAST:
                        return (BlockState)state.with(SHAPE, RailShape.SOUTH_WEST);
                    case SOUTH_WEST:
                        return (BlockState)state.with(SHAPE, RailShape.NORTH_WEST);
                    case NORTH_WEST:
                        return (BlockState)state.with(SHAPE, RailShape.NORTH_EAST);
                    case NORTH_EAST:
                        return (BlockState)state.with(SHAPE, RailShape.SOUTH_EAST);
                    case NORTH_SOUTH:
                        return (BlockState)state.with(SHAPE, RailShape.EAST_WEST);
                    case EAST_WEST:
                        return (BlockState)state.with(SHAPE, RailShape.NORTH_SOUTH);
                }
            default:
                return state;
        }
    }

    public BlockState mirror(BlockState state, BlockMirror mirror) {
        RailShape railShape = (RailShape)state.get(SHAPE);
        switch (mirror) {
            case LEFT_RIGHT:
                switch (railShape) {
                    case ASCENDING_NORTH:
                        return (BlockState)state.with(SHAPE, RailShape.ASCENDING_SOUTH);
                    case ASCENDING_SOUTH:
                        return (BlockState)state.with(SHAPE, RailShape.ASCENDING_NORTH);
                    case SOUTH_EAST:
                        return (BlockState)state.with(SHAPE, RailShape.NORTH_EAST);
                    case SOUTH_WEST:
                        return (BlockState)state.with(SHAPE, RailShape.NORTH_WEST);
                    case NORTH_WEST:
                        return (BlockState)state.with(SHAPE, RailShape.SOUTH_WEST);
                    case NORTH_EAST:
                        return (BlockState)state.with(SHAPE, RailShape.SOUTH_EAST);
                    default:
                        return super.mirror(state, mirror);
                }
            case FRONT_BACK:
                switch (railShape) {
                    case ASCENDING_EAST:
                        return (BlockState)state.with(SHAPE, RailShape.ASCENDING_WEST);
                    case ASCENDING_WEST:
                        return (BlockState)state.with(SHAPE, RailShape.ASCENDING_EAST);
                    case ASCENDING_NORTH:
                    case ASCENDING_SOUTH:
                    default:
                        break;
                    case SOUTH_EAST:
                        return (BlockState)state.with(SHAPE, RailShape.SOUTH_WEST);
                    case SOUTH_WEST:
                        return (BlockState)state.with(SHAPE, RailShape.SOUTH_EAST);
                    case NORTH_WEST:
                        return (BlockState)state.with(SHAPE, RailShape.NORTH_EAST);
                    case NORTH_EAST:
                        return (BlockState)state.with(SHAPE, RailShape.NORTH_WEST);
                }
        }

        return super.mirror(state, mirror);
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{SHAPE, WATERLOGGED});
    }

    static {
        SHAPE = Properties.RAIL_SHAPE;
    }
}
