package function.ops.namespace;

import java.util.Collection;
import java.util.List;

import org.scijava.plugin.Plugin;

import net.imagej.ops.AbstractNamespace;
import net.imagej.ops.Namespace;
import net.imagej.ops.OpMethod;
import net.imagej.ops.geom.geom2d.Circle;
import net.imglib2.RealCursor;
import net.imglib2.RealLocalizable;

@Plugin(type = Namespace.class)
public class Geom extends AbstractNamespace {

	@Override
	public String getName() {
		return "geom";
	}

	@OpMethod(
			op = function.ops.geometry.DefaultSmallestEnclosingCircle.class)
	public Circle smallestenclosingboundingbox(final List<? extends RealLocalizable> in, RealLocalizable center, boolean randomizePointRemoval, int rndSeed) {
		final Circle result = (Circle) ops().run(
				function.ops.geometry.DefaultSmallestEnclosingCircle.class, in, center, randomizePointRemoval, rndSeed);
		return result;
	}
	
	@OpMethod(
			op = function.ops.geometry.DefaultSmallestEnclosingCircleOfCollection.class)
	public Circle smallestenclosingboundingbox(final Collection<? extends RealLocalizable> in, RealLocalizable center, boolean randomizePointRemoval, int rndSeed) {
		final Circle result = (Circle) ops().run(
				function.ops.geometry.DefaultSmallestEnclosingCircleOfCollection.class, in, center, randomizePointRemoval, rndSeed);
		return result;
	}
	
	@OpMethod(
			op = function.ops.geometry.DefaultSmallestEnclosingCircleOfRealCursor.class)
	public Circle smallestenclosingboundingbox(final RealCursor<?> in, RealLocalizable center, boolean randomizePointRemoval, int rndSeed) {
		final Circle result = (Circle) ops().run(
				function.ops.geometry.DefaultSmallestEnclosingCircleOfRealCursor.class, in, center, randomizePointRemoval, rndSeed);
		return result;
	}

}
