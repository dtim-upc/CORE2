package edu.puc.core.execution.structures.CDS.time;

import edu.puc.core.parser.plan.cea.Transition;
import edu.puc.core.runtime.events.Event;

public class CDSTimeOutputNode extends CDSTimeNode {
    final private Event event;
    final private Transition.TransitionType transitionType;
    final private CDSTimeNode child;
    final private int paths;
    final private long max;

    /** Use {@link CDSNodeManager} to create CDSTimeNodes. */
    CDSTimeOutputNode(CDSTimeNode child, Transition.TransitionType transitionType, Event event, long currentTime) {
        this.child = child;
        this.transitionType = transitionType;
        this.event = event;
        this.max = currentTime;
        this.paths = child.getPaths();
    }

    public Event getEvent() {
        return event;
    }

    public Transition.TransitionType getTransitionType() {
        return transitionType;
    }

    public CDSTimeNode getChild() {
        return this.child;
    }

    @Override
    public boolean isBottom() {
        return false;
    }

    @Override
    public long getMax() {
        return this.max;
    }

    @Override
    public int getPaths() {
        return this.paths;
    }
}
