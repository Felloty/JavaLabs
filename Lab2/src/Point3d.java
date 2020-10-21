class Point3d extends Point2d {

    private double zCoord;

    public Point3d (double x, double y, double z) {
        super(x, y);
        zCoord = z;
    }

    public Point3d () {
        this(0, 0, 0);
    }

    public double getZ () {
        return zCoord;
    }

    public void setZ (double val) {
        zCoord = val;
    }

    public boolean Equ (Point3d p) {
        boolean statement;
        if (p.getX() == xCoord && p.getY() == yCoord && p.getZ() == zCoord)
            statement = true;
        else
            statement = false;
        return statement;
    }

    public double distanceTo (Point3d p) {
        return Math.sqrt(Math.pow(xCoord - p.getX(), 2) + Math.pow(yCoord - p.getY(), 2) + Math.pow(zCoord - p.getZ(), 2));
    }
}

