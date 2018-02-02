import javax.swing.*;
 import java.awt.*;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 
 public class GuiInput extends JFrame implements ActionListener{
  GuiInput(String title){
    setTitle(title);
    setSize(500,500);
    setLocation(500,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
      JPanel panel = new JPanel();
      JTextField textfield = new JTextField();
      panel.add(textfield);
      
    JMenuBar menubar = new JMenuBar();
 
    JMenu filemenu = new JMenu("File");
    JMenu editmenu= new JMenu("Edit");
    JMenu helpmenu = new JMenu("Help");
 
    JMenuItem newitem = new JMenuItem("new");
    JMenuItem openitem = new JMenuItem("open");
    JMenuItem closeitem = new JMenuItem("close");
  
    JMenuItem cutitem = new JMenuItem("cut");
    JMenuItem copyitem = new JMenuItem("copy");
    JMenuItem pasteitem = new JMenuItem("paste");
  
    JMenuItem versionitem = new JMenuItem("version");
    JMenuItem indexitem = new JMenuItem("index");
 
    //メニューバーをウィンドウにsetする
    setJMenuBar(menubar);
    //メニューバーにメニューを入れる
    menubar.add(filemenu);
    menubar.add(editmenu);
    menubar.add(helpmenu);
    //メニューにアイテムを入れる
    
    filemenu.add(newitem);
    filemenu.add(openitem);
    filemenu.add(closeitem);
 
    editmenu.add(cutitem);
    editmenu.add(copyitem);
    editmenu.add(pasteitem);
 
    helpmenu.add(versionitem);
    helpmenu.add(indexitem);
 
    newitem.addActionListener(this);
    openitem.addActionListener(this);
    closeitem.addActionListener(this);
    cutitem.addActionListener(this);
    copyitem.addActionListener(this);
    pasteitem.addActionListener(this);
    versionitem.addActionListener(this);
    indexitem.addActionListener(this);
      
      
      Container cp = getContentPane();
         cp.add(panel,BorderLayout.CENTER);
 
  }
 
  public static void main(String[] args){
    GuiInput frame = new GuiInput("window");
    frame.setVisible(true);
  }
 
  public void actionPerformed(ActionEvent e) {
    if(e.getActionCommand() == "new") {
        System.out.println("新規ファイル");
      }
        if(e.getActionCommand() == "open") {
      
          System.out.println("ファイルを開く");
        }
        if(e.getActionCommand() == "close") {
      
          System.out.println("ファイルを閉じる");
        }
        if(e.getActionCommand() == "cut") {
      
          System.out.println("切り取り");
        }
        if(e.getActionCommand() == "copy") {
      
          System.out.println("コピー");
        }
        if(e.getActionCommand() == "paste") {
      
          System.out.println("貼り付け");
        }
        if(e.getActionCommand() == "version") {
          
          System.out.println("更新");
        }
        if(e.getActionCommand() == "index") {
      
          System.out.println("わからない");
        }
  }
 }