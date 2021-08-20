package com.creational.factory;

public class shapeFactory {
Shape getObject(String type)
{
    if (type == null)
        return null;
    else
        if (type.equals("CIRCLE"))
            return new Circle();
        else
            if (type.equals("SQUARE"))
                return new Square();
            else
                if (type.equals("RECTANGLE"))
                    return new Rectangle();
                else
                    return null;
}

}
