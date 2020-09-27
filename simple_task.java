/**
* 	title: simple_task
*	author:  dosven
*	created: 25.09.2000 
*/

// *************** Chapter 1: Co Ban *************** 
// ======== Task 1 ========
// IN RA MAN HINH CAC HOP SO < 100
import java.io.*;
import java.lang.Math;

public class bai1 {
	public static void main(String[] args) {
		int k, n, dem;
		for (k = 1; k <=100 ; ++k ) {
			dem = 0;
			for (n = 2; n<=k ;++n ) {
				if ( k%n == 0 ) {
					dem++;
				}
			}
			if (dem > 1) {
				System.out.println("Hop so la: " + k);
			}
		}
	}
}

// ======== Task 2 ========
// IN RA MAN HINH 15 so nguyen to 

public class bai2 {
	public static void main(String[] args) {
		int k = 2, dem_main = 0;
		do {
			int dem_bien = 0;
			for (int i = 2 ; i <=k ; ++i ) {
				if (k % i == 0) {
					dem_bien++;
				}
			}
			if ( dem_bien == 1 ) {
				System.out.println("So nguyen to la: " + k);
				dem_main++;
			}
			k++;
		} while(dem_main <= 14);
	}
}

// ======== Task 3 ========
// IN RA MAN HINH tat ca so nguyen to tu 1000 den 2000

public class bai3 {
	public static void main(String[] args) {
		
		for (int k = 1000; k <= 2000 ; ++k ) {
			int count = 0;			
			for (int j = 2 ; j <= k) ; ++j ) {
				if (k % j == 0 ) {
					count++ ;
				}
			}
			if (count == 1) {
				System.out.println("So nguyen to: " + k);
			}
		}
	}
}

// ======== Task 4 ========
// IN RA MAN HINH so < 100 chia het cho 3 va 7

public class bai4 {
	public static void main(String[] args) {
		for (int k = 2; k < 100 ; ++k ) {
			if ( ( k%3==0 ) && (k & 7 == 0)) {
				System.out.println("So do la: " + k);	
			}				
		}		
	}	
}

// ======== Task 5 ========
// IN RA MAN HINH so tu 1000 den 2000 chia het cho 3, 5 va 7

public class bai5 {
	public static void main(String[] args) {
		for (int k = 1000; k <= 2000 ; ++k) {
			if (( k % 3 == 0 ) && ( k % 5 == 0) && ( k % 7 == 0 )) {
				System.out.println(k);	
			}
		}
	}
}

// ======== Task 6 ========
// IN RA MAN HINH 10 so hoan hao dau tien

public class bai6 {
	public static void main(String[] args) {
		int k = 0, dem = 0;
		do {
			int tong_uoc = 0;
			for (int i = 1; i < k ; ++i) {
				if (k % i == 0) {
					tong_uoc += i;
				}				
			}
			if ( tong_uoc == k) {
				System.out.println("So hoan hao la: " + k); 
				dem++;
			}
			k++;
		} while (dem < 10);
	}
}

// ======== Task 7 ========
// Cho so tu nhien lon hon 1 bat ki. 
//In ra khai trien thanh tich cua so do tu nho den lon

public static void main(String[] args) {
	int n = 12;
	int k = 2;
	while( k <= n) {
		for ( k = 2; k <= n ; ++k ) {
			if ( n%k == 0) {
				System.out.println(k+"");
				n = n/k;
				break;
			}
		}
	}
}

//*************** Chapter 2: Ham va thu tuc *************** 
/* Task8
* Cho so tu nhien bat ki
* Tinh tong S = 1 + 1/(1+2) + 1/(1+2+3) + ... 
*/

public class bai8 {
	public static void main(String[] args) {
		int N = 2, k;
		float S = 0;
		for (k =1 ; k <= N ; ++k ) {
			S += 1 / (sum(k))  
		} System.out.println("Ket qua la: " + S);
	}
	public static float sum(ink k) {
		int tong = 0;
		int x;
		for ( x = 1 ; x <= k; ++x ) {
			tong+=x;
		} return tong;
	}
}


/* 
* Task9:
* Cho so tu nhien bat ki
* Tinh tong S = 1 + 1/2! + 1/3! + ... 
*/

public class bai9 {
	public static void main(String[] args) {
		float S=0;
		int N = 5 ; 
		for (int k = 1 ; k <= N ; ++k) {
			S += 1/sum(k);
		}
		System.out.println("Ket qua la: " + S);
	}

	public static float sum(int k) {
		int sum = 1;
		for (int j = 1; j <= k ; ++j) {
			sum *= j;
		} 
		return sum;
	}
}


/* 
* Task10:
* Cho so tu nhien bat ki
* Tinh tong S = 1 + 1/(1 + 2!) + 1/(1 + 2! + 3!) + ... 
*/

//Cach 1: Dung 1 ham
public class bai10 {
	public static void main(String[] args) {
		float S = 0;
		int N = 3 ; 
		for (int k = 1 ; k <= N ; ++k) {
			S += 1/sum(k);
		}
		System.out.println("Ket qua la: " + S);
	}

	public static float sum(int k) {
		int tong = 0;
		for (int i = 1 ; i <= k; ++i ) {			
			int tich = 1;
			for ( int j = 1 ; j <= i; ++j ) {
			 	tich *= j;
			} 
			tong += tich;
		} 
		return tong;
	}	
}

// Cach 2: Dung thuan ham
public class bai10 {
	public static void main(String[] args) {
		float S = 0;
		int N = 3 ; 
		for (int k = 1 ; k <= N ; ++k) {
			S += 1/sum(k);
		}
		System.out.println("Ket qua la: " + S);
	}

	public static float sum(int k) {
		int tong = 0, i;
		for ( i = 1 ; i <= k; ++i ) {
			tong += tich(i);
		} return tong;
	}	
	
	public static float tich(int i) {
		int tich = 1;
		for ( int j = 1 ; j <= i; ++j ) {
			tich *= j;
		} return tich;
	}
}
/*
k = 1 (max 4)
j = 1 | sum_1 = 1; sum_2 = 1
--------------------
k = 2 (max 4)
j = 1 | sum_1 = 1; sum_2 = 1
j = 2 | sum_1 = 2; sum_2 = 3 ( 1+ 2!)
--------------------
k = 3 (max 4)
j = 1 | sum_1 = 1; sum_2 = 1
j = 2 | sum_1 = 1*2; sum_2 = 1 + 1*2
j = 3 | sum_1 = 1*2*3; sum_2 = 1 + 1*2 + 1*2*3
*/

//*************** Chapter 3: Bai tap ve mang *************** 
/* 
* Task11:
* Cho day so tu nhien va sap xep theo thu tu giam dan 
*/


public class bai11 {
	public static void main(String[] args) {
		int[] a = { 5, 23 , 43 ,9 , 71, 1, 16, 54};
		int N = 8, i, j, temp;
		for (i = 0; i < N - 1 ; ++i ) {
			for ( j = i + 1; j < N ; ++j ) {
				if (a[i] < a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for (i = 0; i < N ; ++i ) {
			System.out.println(a[i] + ""); 
		}
	}
}


/* 
* Task12:
* Cho day so tu nhien in ra man hinh tat ca so nguyen to trong day so nay 
*/

public class bai12 {
	public static void main(String[] args) {
		int[] a = {7, 11, 43 ,5 ,8, 21, 32};
		for (int i = 0; i < 7 ; ++i ) {
			int count = 0;
			for (int j = 2 ; j <= a[i] ; ++j) {
				if (a[i] % j == 0) {
					count++ ;
				}
			}
			if (count == 1) {
				System.out.println("So nguyen to trong mang: " + a[i]);
			}
		}
	}
}

/* 
* Task13:
* Cho day so tu nhien in ra man hinh gia tri va chi so cua so nho nhat trong day do 
*/

public class bai13 {
	public static void main(String[] args) {
		int[] a = {23, 43, 21, 69 ,3, 11, 94};
		int min = a[0];
		for (int i = 1; i < 5 ; ++i ) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("Gia tri nho nhat trong day: " + min);
		for (int k = 0; k < 7 ; ++k ) {
			if (min == a[k]) {
				System.out.println(k + " ");
			}
		}
	}
}

/* 
* Task14:
* Cho day so tu nhien in ra man hinh gia tri va chi so cua so nho nhat trong day do 
*/



