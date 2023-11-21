package Java101;

import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ay giriniz: ");
            int ay = scanner.nextInt();
            System.out.print("Gün giriniz: ");
            int gun = scanner.nextInt();

            if (ay >= 1 && ay <= 12) {
                if (ay == 1) {
                    if (gun >= 1 && gun <= 31) {
                        if (gun < 22) {
                            System.out.println("Eşleşen burç: Oğlak" );
                        } else {
                            System.out.println("Eşleşen burç: Kova" );
                        }
                    } else {
                        System.out.println("Gün bilgisi hatalı. Girilen gün: " + gun);
                    }
                } else if (ay == 2) {
                    if (gun >= 1 && gun <= 28) {
                        if (gun < 20) {
                            System.out.println("Eşleşen burç: Kova" );
                        } else {
                            System.out.println("Eşleşen burç: Balık" );
                        }
                    } else {
                        System.out.println("Gün bilgisi hatalı. Girilen gün: " + gun);
                    }
                } else if (ay == 3) {
                    if (gun >= 1 && gun <= 31) {
                        if (gun < 22) {
                            System.out.println("Eşleşen burç: Balık" );
                        } else {
                            System.out.println("Eşleşen burç: Koç" );
                        }
                    } else {
                        System.out.println("Gün bilgisi hatalı. Girilen gün: " + gun);
                    }
                } else if (ay == 4) {
                    if (gun >= 1 && gun <= 30) {
                        if (gun < 22) {
                            System.out.println("Eşleşen burç: Koç" );
                        } else {
                            System.out.println("Eşleşen burç: Boğa" );
                        }
                    } else {
                        System.out.println("Gün bilgisi hatalı. Girilen gün: " + gun);
                    }
                } else if (ay == 5) {
                    if (gun >= 1 && gun <= 31) {
                        if (gun < 22) {
                            System.out.println("Eşleşen burç: Boğa" );
                        } else {
                            System.out.println("Eşleşen burç: İkizler" );
                        }
                    } else {
                        System.out.println("Gün bilgisi hatalı. Girilen gün: " + gun);
                    }
                } else if (ay == 6) {
                    if (gun >= 1 && gun <= 30) {
                        if (gun < 22) {
                            System.out.println("Eşleşen burç: İkizler" );
                        } else {
                            System.out.println("Eşleşen burç: Yengeç" );
                        }
                    } else {
                        System.out.println("Gün bilgisi hatalı. Girilen gün: " + gun);
                    }
                } else if (ay == 7) {
                    if (gun >= 1 && gun <= 31) {
                        if (gun < 22) {
                            System.out.println("Eşleşen burç: Yengeç" );
                        } else {
                            System.out.println("Eşleşen burç: Aslan" );
                        }
                    } else {
                        System.out.println("Gün bilgisi hatalı. Girilen gün: " + gun);
                    }
                } else if (ay == 8) {
                    if (gun >= 1 && gun <= 31) {
                        if (gun < 22) {
                            System.out.println("Eşleşen burç: Aslan" );
                        } else {
                            System.out.println("Eşleşen burç: Başak" );
                        }
                    } else {
                        System.out.println("Gün bilgisi hatalı. Girilen gün: " + gun);
                    }
                } else if (ay == 9) {
                    if (gun >= 1 && gun <= 30) {
                        if (gun < 22) {
                            System.out.println("Eşleşen burç: Başak" );
                        } else {
                            System.out.println("Eşleşen burç: Terazi" );
                        }
                    } else {
                        System.out.println("Gün bilgisi hatalı. Girilen gün: " + gun);
                    }
                } else if (ay == 10) {
                    if (gun >= 1 && gun <= 31) {
                        if (gun < 22) {
                            System.out.println("Eşleşen burç: Terazi" );
                        } else {
                            System.out.println("Eşleşen burç: Akrep" );
                        }
                    } else {
                        System.out.println("Gün bilgisi hatalı. Girilen gün: " + gun);
                    }
                } else if (ay == 11) {
                    if (gun >= 1 && gun <= 30) {
                        if (gun < 22) {
                            System.out.println("Eşleşen burç: Akrep" );
                        } else {
                            System.out.println("Eşleşen burç: Yay" );
                        }
                    } else {
                        System.out.println("Gün bilgisi hatalı. Girilen gün: " + gun);
                    }
                } else if (ay == 12) {
                    if (gun >= 1 && gun <= 31) {
                        if (gun < 22) {
                            System.out.println("Eşleşen burç: Yay" );
                        } else {
                            System.out.println("Eşleşen burç: Oğlak" );
                        }
                    } else {
                        System.out.println("Gün bilgisi hatalı. Girilen gün: " + gun);
                    }
                }
            } else {
                System.out.println("Ay bilgisi hatalı. Girilen ay: " + ay);
            }

            System.out.println();
        }
    }
}
