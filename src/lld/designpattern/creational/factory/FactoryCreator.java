package lld.designpattern.creational.factory;


class FactoryCreator {
    public static Object objectType(String type) {
        if (type == null) {
            return null;
        }
        if (type.equals("circle")) {
            Circle c = new Circle();
            return c;
        }
        if (type.equals("rectangle")) {
            Rectangle r = new Rectangle();
            return r;
        }
        if (type.equals("triangle")) {
            Triangle t = new Triangle();
            return t;
        }
        return null;
    }
}
