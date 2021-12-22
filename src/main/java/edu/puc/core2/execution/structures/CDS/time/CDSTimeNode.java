package edu.puc.core2.execution.structures.CDS.time;

public abstract class CDSTimeNode {

    abstract public boolean isBottom();

    /**
     * Maximum-start, denoted max(n).
     */
    abstract public long getMax();

    /** The number of paths from this node */
    abstract public int getPaths();
}