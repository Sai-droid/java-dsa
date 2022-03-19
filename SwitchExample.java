class SwitchExample {
    public static void main(String[] args) {
        for (int j = 1; j <= 5; j++) {
            switch (j) {
                case 1:
                    System.out.println("Case1");
                    break;
                case 2:
                    System.out.println("Case2");
                    break;
                case 3:
                    System.out.println("Case3");
                    break;
                case 4:
                    for (int k = 1; j <= 4; k++) {
                        switch (k) {
                            case 1:
                                System.out.println("Case1");
                                break;
                            case 2:
                                System.out.println("Case2");
                                break;
                            case 3:
                                System.out.println("Case3");
                                break;
                            case 4:
                                System.out.println("Case4");
                                break;
                            default: 
                                break;
                        }
                    }
                case 5:
                    System.out.println("case 5");
                    break;
            }

        }
    }
}