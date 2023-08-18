package graphs;
import java.util.Scanner;

public class GraphAlgos {
	static void dijkstras(int adjmatrix[][],int source)
	{
		int v = adjmatrix.length;
		boolean visited[]=new boolean[v];
		int distance[]=new int[v];
		for(int i=0;i<v;i++)
		{
			distance[i]=Integer.MAX_VALUE;
		}
		distance[source]=0;
		for(int i=0;i<v;i++)
		{
			int minVertex = findMinVertex(distance[],visited[]);
			visited[minVertex]=true;
			for(int j=0;i<v;i++)
			{
				if(adjmatrix[minVertex][j]!=0 && !visited[j]);
				{
					int newDistance = distance[minVertex]+adjmatrix[minVertex][j];
					if(newDistance<distance[j])
					{
						distance[j]=newDistance;
					}
				}
			}
		}
		System.out.println("Shortest paths from "+ source + " are: ");
		for(int i=0;i<distance.length;i++)
		{
			System.out.print(distance[i]+ " ");
		}
		System.out.println();
		}
	static int findMinVertex(int distance[],int visited[])
	{
		int minVertex=-1;
		for(int i=0;i<distance.length;i++)
			{
			if(!(visited[i]&&(minVertex==-1 || distance[i]<distance[minVertex]))
			{
				minVertex=1;
			}
			}
			}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of vertices: ");
		int v = sc.nextInt();
		System.out.println("Enter no. of Edges: ");
		int e = sc.nextInt();
		int adjmatrix[][]=new int [v][v];
		System.out.println("Enter all edge");
		for(int i=0;i<e;i++)
		{
			int v1=sc.nextInt();
			int v2=sc.nextInt();
			int w=sc.nextInt();
			adjmatrix[v1][v2]=w;
			adjmatrix[v2][v1]=w;
		}
		
		dijkstras(adjmatrix,0);

	}

}
