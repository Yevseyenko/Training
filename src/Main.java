public class Main {
    public static double sqr(double arg) {
        long time = System.currentTimeMillis();
        if (time % 2 == 0) {
            System.out.println("sout");
            return arg * arg;
        } else if (time % 2 == 1) {
            while (true) ;
        } else {
            throw new RuntimeException();
        }
    }

    public static int area(int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Negative sizes: w = " + width +
                    " ,h= " + height);
        }
        return width * height;
    }

    public static void f() {
        System.out.println(". . #2.in");
        g();
        System.out.println(". #2.out");
    }

    public static void g() {
        System.out.println(". . #3.in");
        h();
        System.out.println(". #3.out");
    }

    public static void h() {
        System.out.println(". . . . #4.in");
        if (true) {
            System.out.println(". . . #4THROW");
            throw new Error();
        }
        System.out.println(". . . #4.out");
    }

    public static int k() {
        try {
            return 0;
        } finally {
            return 1;
        }
    }

    public static int c() {
        long rnd = System.currentTimeMillis();
        boolean finished = false;
        try {
            if (rnd % 3 == 0) {
                throw new Error();
            } else if (rnd % 3 == 1) {
                throw new RuntimeException();
            } else {

            }
            finished = true;
        } finally {
            if (finished) {
                //не було exceptions
            } else {
                // були exceptions але які
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        //     Main main = new Main();
        //     double d = main.sqr(20);
        //    System.out.println(d);

        //    Scanner in = new Scanner(System.in);
        //    System.out.println("Please input width");
        //    int width = in.nextInt();
        //    System.out.println("Please input width");
        //    int height = in.nextInt();
        //    System.out.println(area(width,height));
        //
        //   System.out.println("#1.in");
        //   try {
        //       f();
        //   } catch (Error e) {
        //       System.out.println("#1.CATCH");
        //   }
        //   System.out.println("#1.out");

        //    try {
        //        System.err.print("0");
        //        if (true) {
        //            throw new RuntimeException();
        //        }
        //        System.err.print("1");
        //    } catch (Exception e) {

        //        System.err.print("2");
        //    }
        //    System.err.println("3");
        //  try {
        //      throw new RuntimeException();
        //  } catch (Exception e) {
        //      if (e instanceof RuntimeException) {
        //          RuntimeException re = (RuntimeException) e;
        //          System.err.print("Це RuntimeException ");
        //      } else {
        //          System.err.print("В якому значенні не RuntimeException");

        //    try {
        //        System.err.print(" 0");
        //        if (true) {
        //            throw new RuntimeException();
        //        }
        //        System.err.print(" 1");
        //    }catch (RuntimeException e){
        //        System.err.print(" 2.1");
        //        try{
        //            System.err.print(" 2.2");
        //            if (true){
        //                throw new Error();
        //            }
        //            System.err.print(" 2.3");
        //        }catch (Throwable t){
        //            System.err.print(" 2.4");
        //        }
        //        System.err.print(" 2.5");
        //        } catch (Error e){
        //        System.err.print(" 3");
        //        }
        //        System.err.println(" 4");
        //   try {
        //   } catch (Error e) {
        //   } catch (RuntimeException e) {
        //   }
        // many catch
        //  try {
        //      throw new Exception();
        //  } catch (RuntimeException e) {
        //      System.err.println("catch RuntimeException");
        //  } catch (Exception e) {
        //      System.err.println("catch Exception");
        //  } catch (Throwable e) {
        //      System.err.println("catch Throwable");
        //  }
        //  System.err.println("next statement");
        //
        //    try{
        //        Throwable t = new Exception();
        //        throw t;
        //    } catch (RuntimeException e){
        //        System.err.println("catch RuntimeException");
        //    }catch (Exception e){
        //        System.err.println("catch Exception");
        //    }catch(Throwable e){
        //        System.err.println("catch Throwable");
        //    }
        //    System.err.println("next statement");
        //   try {
        //       System.err.println("try");
        //   } finally {
        //       System.err.println("finally");
        //   }
        //  try{throw new RuntimeException();
        //  }finally {
        //      System.err.println("finally");
        //  }
        //     try {
        //         return;
        //     } finally {
        //         System.err.println("finally");
        //     }
        //  try{
        //      Runtime.getRuntime().exit(23);
        //  } finally {
        //      System.err.println("finally");
        //  }
        //     try {
        //         System.err.println("try");
        //         if (true){
        //             throw new RuntimeException();
        //         }
        //     }finally{
        //         System.err.println("finally");
        //     }
        //     System.err.println("more");

        //   System.err.println(с());
        // Vlozheni try
        //    try {
        //        System.err.println(" 0");
        //        try {
        //            System.err.println(" 1");
//
        //            System.err.println(" 2");
        //        } catch (RuntimeException e) {
        //            System.err.println(" 3");
        //        } finally {
        //            System.err.println(" 4");
        //        }
        //        System.err.println(" 5");
        //    } catch (
        //            Exception e)
//
        //    {
        //        System.err.println(" 6");
        //    } finally
//
        //    {
        //        System.err.println(" 7");
        //    }
        //    System.err.println(" 8");
// Perehvat zovni
        //    try {
        //        System.err.print(" 0");
        //        try {
        //            System.err.print(" 1");
        //            if (true) {
        //                throw new Exception();
        //            }
        //            System.err.print(" 2");
        //        } catch (RuntimeException e) {
        //            System.err.print(" 3");
        //        } finally {
        //            System.err.print(" 4");
        //        }
        //        System.err.print(" 5");
        //    } catch (Exception e)
        //    {
        //        System.err.print(" 6");
        //    } finally
        //    {
        //        System.err.print(" 7");
        //    }
        //    System.err.print(" 8");
        // Vlozhenist dwa
        try {
            System.err.print(" 0");
            try {
                System.err.print(" 1");
                if (true) { throw new Error(); }
                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3");
            } finally {
                System.err.print(" 4");
            }
            System.err.print(" 5");
        } catch (Exception e) {
            System.err.print(" 6");

        } finally {
            System.err.print(" 7");
        }
        System.err.println(" 8");
    }
}

