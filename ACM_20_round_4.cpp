/**
*	author:  dosven
*	created: 21.09.2000 21:10
*/


#include <iostream>
#include <string>
#include <cmath>
using namespace std;

// P204PROB - Tính tổng Dãy Số
/*
 Cho n tính tổng dãy số từ 1 đến n theo công thức sau:
S = -1 + 2 -3 +4 - 5 + 6 -7 + 8 - 9 + 10
*/

// VD: n = 1  (-1) | 2(1) | 3(-2) | 4 (2) | 5 (-3) | 6 (3) | 7 (-4) | 8 (4) | 9 (-5) | 10 (5)

int main() {
	int S, n;
	cout << "Nhap vao so tu nhien n: " << endl;
	cin >> n;
	if ( n % 2 == 0) {
		S = n / 2;
		cout << "Tong n so tu nhien theo quy tac la: " << S << endl;
	} else {
		S = - (n - (n-1)/2);
		cout << "Tong n so tu nhien theo quy tac la: " << S << endl;
	}
	return 0; 
}



// P204PROG - Hình vuông lớn nhất 
/*
Mincy muốn sửa lại mái nhà bằng một mái nhà mới làm bằng gỗ. 
Cô ấy có N tấm ván hình chữ nhật được đánh số từ 1 đến N. 
Tấm ván thứ I có kích thước ai * 1 (có nghĩa là chiều rộng là 1, còn chiều dài là ai).
Mincy muốn làm một mái nhà hình vuông. Nhưng Mincy muốn có một mái nhà to nhất, 
cô ấy xếp các tấm gỗ lại với nhau và dính chúng lại và các tấm gỗ luôn song song nhau. 
Cuối cùng cô cắt ra một tấm gỗ hình vuông có kích thước lớn nhất.
Hãy giúp Mincy tính chiều dài cạnh của hình vuông lớn nhất đó.

----------------------------------------
Input:
Dòng đầu tiên chứa T là số lượng bộ test (1 <= T <= 10).
Với mỗi bộ test:

+ Dòng đầu tiên của bộ test chứa N (1 <= N <= 1000) là số lượng thanh gỗ.
+ Dòng thứ hai chứa N số nguyên ai (1 <= ai <= N) là chiều dài của thanh gỗ thứ i.

Output:
Với mỗi bộ test, đưa ra số nguyên duy nhất là chiều dài cạnh của hình vuông lớn nhất Mincy có thể tạo ra.
----------------------------------------
*/

const int MAX = 100; 

int main() {
	int n, l; //n là số lượng thanh gỗ và l là chiều dài mỗi thanh 
	int arr[MAX];
	
	cout << "So luong thanh go: " << endl;
	cin >> n;
	cout << "Chieu dai moi thanh go: " << endl;
	for (int i = 0; i < n; ++i) 
		cin >> arr[i];

	for (int j = n; j > 0 ; --j) {
		int dem = 0;
		for (int k = 0; k < n; ++k) {
			if (arr[k] >= j) dem ++;
		}

		if (dem >= j) {
			cout << "Gia tri lon nhat canh mai nha: " << j << endl;
			break;
		}
	}
}

// P204PROH - Xây Tháp (chưa làm được)
// https://www.spoj.com/PTIT/problems/P204PROH/


/* <<<<<<<<< P204PROA - abc coins >>>>>>>>>>
Bạn muốn mua coca và hiện trong túi có n đồng. 
Bạn có thể mua 1 coca lon với giá a đồng hoặc mua coca thủy tinh với giá b đồng 
và khi trả lại chai thủy tinh rỗng được hoàn c đồng. 
Hãy tính số lượng chai lớn nhất bạn có thể mua.
--------------------------------------
Input
1 dòng duy nhất là 4 số n, a, b, c (1 <= n, a, b, c <= 1e18, c < b)

Output
Một số duy nhất là kết quả của bài toán.
--------------------------------------
Sample:
10 11 9 8
.......
2

10 5 6 1
.......
2
*/



int main() {
	int n, a, b, c, dem1, dem2 ;
	cout << "Nhap du lieu: " ;	
	cin >> n >> a >> b;
// n: tien | a: gia lon | b: gia chai | c: gia hoan tra
	dem1 = n / a;
	dem2 = n / b;
	for (int i = 1; i < count; i += b){
		for (int j = 0; j  count; j += b) {
			if ( a*i + b*j >= n) {
				/* code */
			}
		}
	}
}

// P204PROF - Chọn số
// Tìm số đẹp lớn nhất 

const int MAX = 100; 

int main() {
	int n;
	int arr[MAX];
	cout << "Nhap vao so nguyen dương n: " << endl;
	
// Tìm các ước của số nguyên dương n
	for (int i = 0; i < n; ++i) {
		if (n % i == 0 ){
			cin >> arr[];
		}
	}
	for (int i = n; i > 1; --i){
	 	for (int j = 2; j < n; ++j){
	 		if ( i % (j^2) == 0 ) {
	 			break;
	 		}else {

	 		}
	 	}
	}
	return 0;
}