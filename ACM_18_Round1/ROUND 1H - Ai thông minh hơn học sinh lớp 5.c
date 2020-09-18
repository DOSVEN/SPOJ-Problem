#include <stdio.h>

int main(){
    int a, b;
    int count = 0;
    printf("Nhap vao so nguyen a, b (a < b): \n");
    scanf("%d%d", &a, &b);
    for (int n = 1; n <= b; ++n) {
        if (b % n == a){
            count += 1;
        }
    }printf("So so nguyen thoa man yeu cau de bai la: %d ", count);
}
