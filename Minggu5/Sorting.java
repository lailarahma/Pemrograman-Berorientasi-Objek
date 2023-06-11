import java.util.Scanner;
class Sorting {
void printArray(int arr[])
{
int n = arr.length;
for (int i = 0; i < n; ++i)
System.out.print(arr[i] + " ");
System.out.println();
}
static void swap(int[] arr, int i, int j)
{
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
void bubbleSort(int arr[])
{
int n = arr.length;
for (int i = 0; i < n - 1; i++){
for (int j = 0; j < n - i - 1; j++){
if (arr[j] > arr[j + 1]) {
int temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
printArray(arr);
}
}
}
}
int partition(int[] arr, int low, int high)
{
int pivot = arr[high];
int i = (low - 1);
for (int j = low; j <= high - 1; j++) {

if (arr[j] < pivot) {
i++;
swap(arr, i, j);
printArray(arr);
}
}
swap(arr, i + 1, high);
return (i + 1);
}
void quickSort(int[] arr, int low, int high)
{
if (low < high) {

int pi = partition(arr, low, high);
quickSort(arr, low, pi - 1);
quickSort(arr, pi + 1, high);
}
}
void insertionSort(int arr[])
{
int n = arr.length;
for (int i = 1; i < n; ++i) {
int key = arr[i];
int j = i - 1;
while (j >= 0 && arr[j] > key) {
arr[j + 1] = arr[j];
j = j - 1;
printArray(arr);
}
arr[j + 1] = key;
}
}
void selectionSort(int arr[])
{
int n = arr.length;
for (int i = 0; i < n-1; i++)
{
int min_idx = i;
for (int j = i+1; j < n; j++){
if (arr[j] < arr[min_idx]){
min_idx = j;
}
}
swap(arr, min_idx, i);
printArray(arr);
}
}
void merge(int a[], int beg, int mid, int end)
{
int i, j, k;
int n1 = mid - beg + 1;
int n2 = end - mid;
/* temporary Arrays */
int LeftArray[] = new int[n1];
int RightArray[] = new int[n2];
/* copy data to temp arrays */

for (i = 0; i < n1; i++)
LeftArray[i] = a[beg + i];
for (j = 0; j < n2; j++)
RightArray[j] = a[mid + 1 + j];
i = 0; /* initial index of first sub-array */
j = 0; /* initial index of second sub-array */
k = beg; /* initial index of merged sub-array */
while (i < n1 && j < n2)
{
if(LeftArray[i] <= RightArray[j])
{
a[k] = LeftArray[i];
i++;
}
else
{
a[k] = RightArray[j];
j++;
}
k++;
}
while (i<n1)
{
a[k] = LeftArray[i];
i++;
k++;
}
while (j<n2)
{
a[k] = RightArray[j];
j++;
k++;
}
}
void mergeSort(int a[], int beg, int end)
{
if (beg < end)
{
int mid = (beg + end) / 2;
mergeSort(a, beg, mid);
mergeSort(a, mid + 1, end);
merge(a, beg, mid, end);
printArray(a);
}
}
}
