import java.awt.*;
 import javax.swing.*;
 import java.awt.event.*;
 import java.text.DateFormat;
 import java.text.ParseException;
 import java.text.SimpleDateFormat;
 import java.util.Date;
 import java.util.Calendar;
 import java.util.GregorianCalendar;
 import java.time.LocalDate;
 import java.time.Month;
 import java.time.Period;
 
  public class GuiInput  extends JFrame implements ActionListener{
 
   JTextField jtx;
   JTextField jtx2;
   JTextField jtx3;
   JLabel gundam;
 
    public static void main(String[] args){
      GuiInput kkysf = new GuiInput("Gui");
        kkysf.setVisible(true);
    }
    GuiInput(String title){
 
          setTitle(title);
          setSize(1000,500);
        setLocation(500,500);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
          JLabel jll = new JLabel(" 年齢計算ツール");
          jll.setFont(jll.getFont().deriveFont(32.0f));
 
          JPanel jpl = new JPanel();
          jpl.setLayout(new GridLayout(2,1));
          jpl.add(jll);
 
 
          JLabel explain = new JLabel("<html><pre>&nbsp;&nbsp;この欄に生年月日を入力すると年齢が出力されます。誤入力がありますとエラーが出るのでお間違いのないようご入力ください。</pre></html>");
          explain.setFont(explain.getFont().deriveFont(14.0f));
          jpl.add(explain);
 
 
          JPanel center = new JPanel();
          center.setLayout(new BoxLayout(center, BoxLayout.Y_AXIS));
 
          //------------------inputs------------------------//
 
          // input panel
          JPanel inputs = new JPanel();
          inputs.setLayout(new FlowLayout(FlowLayout.LEADING));
          inputs.setMaximumSize( new Dimension(Integer.MAX_VALUE, 40) );
          center.add(inputs);
 
          inputs.add(new JLabel("年:"));
          jtx = new JTextField("");
          jtx.setPreferredSize( new Dimension( 100, 30 ));
          inputs.add(jtx);
 
          inputs.add(new JLabel("月:"));
          jtx2 = new JTextField("");
          jtx2.setPreferredSize( new Dimension( 50, 30 ));
          inputs.add(jtx2);
 
          inputs.add(new JLabel("日:"));
          jtx3 = new JTextField("");
          jtx3.setPreferredSize( new Dimension( 50, 30 ));
          inputs.add(jtx3);
 
          JButton btn = new JButton("計算");
          btn.addActionListener(this);
          inputs.add(btn);
 
 
 
 
          //-------------------inputs end------------------------
 
          //------------------result------------------------
          JPanel result = new JPanel();
          result.setLayout(new FlowLayout(FlowLayout.LEADING));
          center.add(result);
 
          gundam = new JLabel("");
          gundam.setFont(gundam.getFont().deriveFont(20.0f));
          result.add(gundam);
          //---------------------result end----------------------------------
 
          Container cp = getContentPane();
          cp.add(jpl,BorderLayout.PAGE_START);
          cp.add(center,BorderLayout.CENTER);
 
      }
 
     public void actionPerformed(ActionEvent event) {
 
       String year = jtx.getText();
       String month = jtx2.getText();
       String day = jtx3.getText();
 
       try {
         calculate(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));
       } catch (NumberFormatException e) {
           gundam.setText("数字のみ入力してください。");
       }
 
 
     }
 
     public void calculate(int year,int month, int day){
 
         LocalDate bday = LocalDate.of(year,month, day);
         LocalDate today = LocalDate.now();
         Period age = Period.between(bday, today);
         int years = age.getYears();
         int months = age.getMonths();
 
         gundam.setText("あなたは:" + years+"才です");
 
     }
  }