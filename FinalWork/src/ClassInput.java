import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Dimon on 02.08.2015.
 */
public class ClassInput {

    ClassInput() throws IOException {
        System.out.println("������� �������� ������");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String InputName = br.readLine();

        System.out.println("������� ����������� ��������������� ������");
        String Number = br.readLine();
        int numb = Integer.parseInt(Number);
        System.out.println("������� �� �� ��� ������ ��������������");

    }
}
