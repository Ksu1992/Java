package ua.naryshkina.practice7;
//Создайте класс, который описывает вектор (в трёхмерном пространстве).
//У него должны быть:
//а) конструктор с параметрами в виде списка координат x, y, z
//б) метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt():
//в) метод, вычисляющий векторное произведение с другим вектором
//г) метод, вычисляющий косинус угла между векторами: косинус угла между векторами
//равен скалярному произведению векторов, деленному на произведение модулей (длин)
//векторов;
//д) методы для суммы и разности векторов
//е) статический метод, который принимает целое число N, и возвращает массив случайных
//векторов размером N.
//*Если метод возвращает вектор, то он должен возвращать новый объект, а не менять
//базовый

public class Vector3D {
    double x;
    double y;
    double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //метод вычисляющий длину вектора
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    //метод вычисляющий векторное произведение с другим вектором

    public Vector3D crossProduct(Vector3D vector) {
        return new Vector3D(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }

    //метод вычисляющий скалярное произведение
    public double skalarVector(Vector3D vektor) {
        return x * vektor.x + y * vektor.y + z * vektor.z;
    }


    //метод, вычисляющий косинус угла между векторами: косинус угла между векторами
////равен скалярному произведению векторов, деленному на произведение модулей (длин)
////векторов;


    public double cos(Vector3D vector) {
        return skalarVector(vector) / (length() * vector.length());
    }

    //метод для суммы векторов

    public Vector3D sum(Vector3D vector) {
        return new Vector3D(
                x + vector.x,
                y + vector.y,
                z + vector.z
        );
    }


    //метод разности векторов

    public Vector3D difference(Vector3D vector) {
        return new Vector3D(
                x - vector.x,
                y - vector.y,
                z - vector.z
        );
    }
    //статический метод, который принимает целое число N, и возвращает массив случайных
    //векторов размером N.

    public static Vector3D[] generate(int n) {
        Vector3D[] vectors = new Vector3D[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector3D(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
    public static void main(String[] args) {
        Vector3D[] vectors = Vector3D.generate(10);
        System.out.println(vectors[0]);
        System.out.println(vectors[1]);
        System.out.println(vectors[0].length());
        System.out.println(vectors[0].skalarVector(vectors[1]));
        System.out.println(vectors[0].crossProduct(vectors[1]));
        System.out.println(vectors[0].cos(vectors[1]));
        System.out.println(vectors[0].sum(vectors[1]));
        System.out.println(vectors[0].difference(vectors[1]));
    }
}


