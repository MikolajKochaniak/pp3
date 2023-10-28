public class SurfaceArea {
    double R;
    double x;
    double r;
    double l;
    double sphereSurface;
    double coneSurface;
    double cuboidSurface;

    void surfaceOfSphere(){
        sphereSurface = 4*Math.PI*R*R;

    }
    void surfaceOfCone(){
        coneSurface = Math.PI*r*r+Math.PI*r*l;

    }
    void surfaceOfCuboid(){

        cuboidSurface = x*x*6;
    }
}
