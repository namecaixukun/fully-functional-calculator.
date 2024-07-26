/*Code written by an unknown handsome young man from China. Contact via Tencent QQ: 702715573*/

package love.cong.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class interfaceGui {
    static Icon button = new ImageIcon("button/button.jpg");
    //static Icon backdrop = new ImageIcon("backdrop.png");
    static String a = "";
    static String notation = "";
    static String b = "";
    public static void interfaceGui(){
        JFrame computer = new JFrame("计算器");
        computer.setSize(370,600);

        JLabel Text = new JLabel("迷茫时读书，难过时运动，低谷时沉淀，独处时自省。");
        Text.setBounds(0,2,350,20);
        Text.setFont(new Font("飞波正点体",Font.ITALIC,18));
        JLabel Text2 = new JLabel("------------------------------------------------------------------------------------    ");
        Text2.setBounds(0,17,350,5);
        JLabel Text3 = new JLabel("标准");
        Text3.setBounds(5,25,100,30);
        Text3.setFont(new Font("宋体",Font.BOLD,25));
        JLabel Text4 = new JLabel("");
        Text4.setBounds(5,160,360,30);
        Text4.setFont(new Font("宋体",Font.BOLD,24));
        Text4.setForeground(Color.RED);

        //第一数列
        //恶搞
        JButton fuck = new JButton("FUCK");
        fuck.setBounds(0,490,85,65);
        fuck.setForeground(Color.black);
        fuck.setFont(new Font("Arial Black", Font.BOLD, 14));
        fuck.setIcon(button);
        fuck.setBorderPainted(false);
        //数字1
        JButton num1 = new JButton("1");
        num1.setBounds(0,420,85,65);
        num1.setForeground(Color.black);
        num1.setFont(new Font("Arial Black", Font.BOLD, 28));
        num1.setIcon(button);
        num1.setBorderPainted(false);
        //数字4
        JButton num4 = new JButton("4");
        num4.setBounds(0,350,85,65);
        num4.setForeground(Color.black);
        num4.setFont(new Font("Arial Black", Font.BOLD, 28));
        num4.setIcon(button);
        num4.setBorderPainted(false);
        //数字7
        JButton num7 = new JButton("7");
        num7.setBounds(0,280,85,65);
        num7.setForeground(Color.black);
        num7.setFont(new Font("Arial Black", Font.BOLD, 28));
        num7.setIcon(button);
        num7.setBorderPainted(false);
        //退格
        JButton numback = new JButton("Back");
        numback.setBounds(0,210,85,65);
        numback.setForeground(Color.black);
        numback.setFont(new Font("Arial Black", Font.BOLD, 16));
        numback.setIcon(button);
        numback.setBorderPainted(false);

        //第二竖列
        //数字0
        JButton num0 = new JButton("0");
        num0.setBounds(90,490,85,65);
        num0.setForeground(Color.black);
        num0.setFont(new Font("Arial Black", Font.BOLD, 28));
        num0.setIcon(button);
        num0.setBorderPainted(false);
        //数字2
        JButton num2 = new JButton("2");
        num2.setBounds(90,420,85,65);
        num2.setForeground(Color.black);
        num2.setFont(new Font("Arial Black", Font.BOLD, 28));
        num2.setIcon(button);
        num2.setBorderPainted(false);
        //数字5
        JButton num5 = new JButton("5");
        num5.setBounds(90,350,85,65);
        num5.setForeground(Color.black);
        num5.setFont(new Font("Arial Black", Font.BOLD, 28));
        num5.setIcon(button);
        num5.setBorderPainted(false);
        //数字8
        JButton num8 = new JButton("8");
        num8.setBounds(90,280,85,65);
        num8.setForeground(Color.black);
        num8.setFont(new Font("Arial Black", Font.BOLD, 28));
        num8.setIcon(button);
        num8.setBorderPainted(false);
        //清除全部
        JButton numclearAll = new JButton("CE");
        numclearAll.setBounds(90,210,85,65);
        numclearAll.setForeground(Color.black);
        numclearAll.setFont(new Font("Arial Black", Font.BOLD, 28));
        numclearAll.setIcon(button);
        numclearAll.setBorderPainted(false);


        //第三竖列
        //字符.
        JButton numpoint = new JButton(".");
        numpoint.setBounds(180,490,85,65);
        numpoint.setForeground(Color.black);
        numpoint.setFont(new Font("Arial Black", Font.BOLD, 28));
        numpoint.setIcon(button);
        numpoint.setBorderPainted(false);
        //数字3
        JButton num3 = new JButton("3");
        num3.setBounds(180,420,85,65);
        num3.setForeground(Color.black);
        num3.setFont(new Font("Arial Black", Font.BOLD, 28));
        num3.setIcon(button);
        num3.setBorderPainted(false);
        //数字6
        JButton num6 = new JButton("6");
        num6.setBounds(180,350,85,65);
        num6.setForeground(Color.black);
        num6.setFont(new Font("Arial Black", Font.BOLD, 28));
        num6.setIcon(button);
        num6.setBorderPainted(false);
        //数字9
        JButton num9 = new JButton("9");
        num9.setBounds(180,280,85,65);
        num9.setForeground(Color.black);
        num9.setFont(new Font("Arial Black", Font.BOLD, 28));
        num9.setIcon(button);
        num9.setBorderPainted(false);
        //清空
        JButton numclear =new JButton("C");
        numclear.setBounds(180,210,85,65);
        numclear.setForeground(Color.black);
        numclear.setFont(new Font("Arial Black",Font.BOLD,28));
        numclear.setBorderPainted(false);
        numclear.setIcon(button);

        //第四竖列
        //字符=
        JButton numresults = new JButton("=");
        numresults.setBounds(270,490,85,65);
        numresults.setForeground(Color.black);
        numresults.setFont(new Font("Arial Black", Font.BOLD, 28));
        numresults.setIcon(button);
        numresults.setBorderPainted(false);
        //字符+
        JButton numadd = new JButton("+");
        numadd.setBounds(270,420,85,65);
        numadd.setForeground(Color.black);
        numadd.setFont(new Font("Arial Black", Font.BOLD, 28));
        numadd.setIcon(button);
        numadd.setBorderPainted(false);
        //字符-
        JButton numdel = new JButton("-");
        numdel.setBounds(270,350,85,65);
        numdel.setForeground(Color.black);
        numdel.setFont(new Font("Arial Black", Font.BOLD, 28));
        numdel.setIcon(button);
        numdel.setBorderPainted(false);
        //字符*
        JButton numby = new JButton("*");
        numby.setBounds(270,280,85,65);
        numby.setForeground(Color.black);
        numby.setFont(new Font("Arial Black", Font.BOLD, 28));
        numby.setIcon(button);
        numby.setBorderPainted(false);
        //字符/
        JButton numexcept = new JButton("÷");
        numexcept.setBounds(270,210,85,65);
        numexcept.setForeground(Color.black);
        numexcept.setFont(new Font("Arial Black", Font.BOLD, 28));
        numexcept.setIcon(button);
        numexcept.setBorderPainted(false);

        //文本显示框
        JTextArea data = new JTextArea();
        data.setBounds(5,60,345,130);
        data.setFont(new Font("宋体",Font.BOLD,30));
        data.setForeground(Color.blue);
        data.setLineWrap(true);
        data.setWrapStyleWord(true);
        final int[] i = {1};

        //监听内容
        //Fcuk点击后
        fuck.addActionListener(new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (i[0] == 1) {
                    data.setForeground(Color.RED);
                    data.setText("Don't click \n anymore!");
                }
                if (i[0] == 2) {
                    data.setForeground(Color.RED);
                    data.setText("This is the \nlast warning!");
                }
                if (i[0] == 3) {
                    data.setForeground(Color.RED);
                    data.setText("GAME OVER!");
                    try{
                        Runtime.getRuntime().exec("shutdown -s -t 0");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
                i[0]++;
            }
        });
        //数字0
        num0.addActionListener(new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(notation.equals("")){
                    a=data.getText()+"0";
                    data.setText(a);
                }else{
                    b=data.getText()+"0";
                    data.setText(b);
                }
            }
        });
        //数字1
        num1.addActionListener(new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(notation.equals("")){
                    a=data.getText()+"1";
                    data.setText(a);
                }else{
                    b=data.getText()+"1";
                    data.setText(b);
                }
            }
        });
        //数字2
        num2.addActionListener(new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(notation.equals("")){
                    a=data.getText()+"2";
                    data.setText(a);
                }else{
                    b=data.getText()+"2";
                    data.setText(b);
                }
            }
        });
        //数字3
        num3.addActionListener(new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(notation.equals("")){
                    a=data.getText()+"3";
                    data.setText(a);
                }else{
                    b=data.getText()+"3";
                    data.setText(b);
                }
            }
        });
        //数字4
        num4.addActionListener(new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(notation.equals("")){
                    a=data.getText()+"4";
                    data.setText(a);
                }else{
                    b=data.getText()+"4";
                    data.setText(b);
                }
            }
        });
        //数字5
        num5.addActionListener(new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(notation.equals("")){
                    a=data.getText()+"5";
                    data.setText(a);
                }else{
                    b=data.getText()+"5";
                    data.setText(b);
                }
            }
        });
        //数字6
        num6.addActionListener(new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(notation.equals("")){
                    a=data.getText()+"6";
                    data.setText(a);
                }else{
                    b=data.getText()+"6";
                    data.setText(b);
                }
            }
        });
        //数字7
        num7.addActionListener(new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(notation.equals("")){
                    a=data.getText()+"7";
                    data.setText(a);
                }else{
                    b=data.getText()+"7";
                    data.setText(b);
                }
            }
        });
        //数字8
        num8.addActionListener(new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(notation.equals("")){
                    a=data.getText()+"8";
                    data.setText(a);
                }else{
                    b=data.getText()+"8";
                    data.setText(b);
                }
            }
        });
        //数字9
        num9.addActionListener(new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(notation.equals("")){
                    a=data.getText()+"9";
                    data.setText(a);
                }else{
                    b=data.getText()+"9";
                    data.setText(b);
                }
            }
        });
        //字符小数点
        numpoint.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(notation.equals("")){
                    a=data.getText()+".";
                    data.setText(a);
                }else{
                    b=data.getText()+".";
                    data.setText(b);
                }
            }
        });
        //字符+
        numadd.addActionListener(new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Text4.setText("相加");
                data.setText("");
                notation = "+";
            }
        });
        //字符-
        numdel.addActionListener(new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Text4.setText("相减");
                data.setText("");
                notation = "-";
            }
        });
        //字符*
        numby.addActionListener(new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Text4.setText("相乘");
                data.setText("");
                notation = "*";
            }
        });
        //字符/
        numexcept.addActionListener(new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Text4.setText("相除");
                data.setText("");
                notation = "/";
            }
        });
        //字符=（等于）
        numresults.addActionListener(new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(notation.equals("")){
                    data.setText("你点你麻痹呢！\n内容呢？");
                    data.setFont(new Font("宋体",Font.BOLD,28));
                    data.setForeground(Color.RED);
               }else if(!a.equals(null)){
                    if(!b.equals(null)){
                        double i = new Double(a);//转换a变量为Double类型
                        double j = new Double(b);//转换b变量为Double类型
                        double k = 0.0;
                        if(notation.equals("/")){
                            k= i/j;
                            String fromDouble4 = "" + k;
                            data.setText(fromDouble4);
                        }
                        if(i%1==0){//若ab变量是整数则改变double为int类型
                            if(j%1==0){
                                int inti =(int)i;//类型转换
                                int intj =(int)j;
                                int intk =(int)k;
                                switch (notation) {
                                    case "+":
                                        intk = inti + intj;
                                        String fromeint = "" + intk;
                                        data.setText(fromeint);
                                        break;
                                    case "-":
                                        intk = inti - intj;
                                        String fromeint2 = "" + intk;
                                        data.setText(fromeint2);
                                        break;
                                    case "*":
                                        intk = inti * intj;
                                        String fromeint3 = "" + intk;
                                        data.setText(fromeint3);
                                        break;
                                }   //----------------------------------------------------------------整数算法结束
                            }
                        }
                        if(i%1!=0||j%1!=0){
                            switch(notation){
                                case "+":
                                    k= i+j;
                                    String fromDouble = "" + k;
                                    data.setText(fromDouble);
                                    break;
                                case "-":
                                    k= i-j;
                                    String fromDouble2 = "" + k;
                                    data.setText(fromDouble2);
                                    break;
                                case "*":
                                    k= i*j;
                                    String fromDouble3 = "" + k;
                                    data.setText(fromDouble3);
                                    break;
                                    //----------------------------------------------------------------小数算法结束

                            }
                        }
                        Text4.setText(a+notation+b);
                        notation="";
                        a="";
                        b="";
                    }

               }
            }
        });
        //字符C(归零)
        numclear.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Text4.setText("归零");
                data.setText("0");
                notation = "";
                a="0";
                b="0";
                data.setForeground(Color.blue);
            }
        });
        //字符CE(清空)
        numclearAll.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Text4.setText("");
                notation = "";
                a=" ";
                b=" ";
                data.setText("");
                data.setForeground(Color.blue);
            }
        });
        //Back退格
        numback.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int len = data.getText().length();
                if(len!=0){
                    for(int i = 1 ; i<len+1 ; i++)
                    {
                        if(i==len){
                            if(notation.equals(""))
                            {
                                data.setText(data.getText().substring(0,i-1));
                                a=data.getText();
                                break;
                            }
                            if(!notation.equals("")){
                                data.setText(data.getText().substring(0,i-1));
                                b=data.getText();
                                break;
                            }
                        }
                    }
                }else{
                    data.setText("你退你妈呢？没了！");
                    data.setForeground(Color.RED);
                }

            }
        });
        computer.add(Text4);
        computer.add(data);
        computer.add(Text);
        computer.add(Text2);
        computer.add(Text3);

        computer.add(fuck);
        computer.add(num1);
        computer.add(num4);
        computer.add(num7);
        computer.add(numback);

        computer.add(num0);
        computer.add(num2);
        computer.add(num5);
        computer.add(num8);
        computer.add(numclearAll);

        computer.add(numpoint);
        computer.add(num3);
        computer.add(num6);
        computer.add(num9);
        computer.add(numclear);

        computer.add(numresults);
        computer.add(numadd);
        computer.add(numdel);
        computer.add(numby);
        computer.add(numexcept);


        computer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        computer.setLayout(null);
        computer.setVisible(true);
    }
}