class Point{
    int x;
    int y;

    String getLocation(){
        return "x: " + x + ", y : "+ y;
    }
}
class Point3D extends Point{
    int z;
    String getLoString(){ //오버라이딩
        return "x: " + x + ", y : "+ y+", z : " + z;
    }
}