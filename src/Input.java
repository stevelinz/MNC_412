// java Program to create a simple JPanel add components to it

import javax.swing.*;
import java.awt.*;

class Input extends JFrame {

    // JFrame
    static JFrame z;

    // JButton
    static JButton c, cx, d, dx, fb, f, fx, g, gx, a, ax, b, run, clear, kill;

    public void buttonShow() {
        // create a new frame to store text field and button
        z = new JFrame("NMC2  Musical Scale by Steve Linz 2020");

        JPanel p = new JPanel();
        p.setVisible(true);

        // create a new buttons
        c = new JButton("C");
        cx = new JButton("C#");
        d = new JButton("D");
        dx = new JButton("D#");
        fb = new JButton("E");
        f = new JButton("F");
        fx = new JButton("F#");
        g = new JButton("G");
        gx = new JButton("G#");
        a = new JButton("A");
        ax = new JButton("A#");
        b = new JButton("B");

        run = new JButton("TEST");
        clear = new JButton("CLEAR");
        kill = new JButton("KILL");

        // create a panel to add buttons
        p.add(c);
        p.add(cx);
        p.add(d);
        p.add(dx);
        p.add(fb);
        p.add(f);
        p.add(fx);
        p.add(g);
        p.add(gx);
        p.add(a);
        p.add(ax);
        p.add(b);

        p.add(run);
        p.add(clear);
        p.add(kill);

      //  JTextField textField = new JTextField(3);
     //   textField.setText("");
      //  p.add(textField).isForegroundSet();

        int[] scale = new int[13];
        String[] dDisplay = new String[13];

        //        0    1   2     3    4    5    6    7    8    9   10   11   12
        //        B    C   C#    D    D#   E    F    F#   G    G#   A   A#   B

       // textField.setText("note");

        run.setToolTipText("Programs to explore note to chord relations");
        clear.setToolTipText("CLEAR button to start over.");
        kill.setToolTipText("Terminate .... Whole idea is to play chords together in ways " +
                            "not found in any music theory book, then to know what to jam against it.");

        JTextArea area = new JTextArea(1, 50);  //maj
        area.setBounds(100, 160, 800, 20);
        area.setFont(new Font("Century", Font.BOLD, 16));
        area.setEditable(false);
        area.setLineWrap(true);
        p.add(area);
        area.setForeground(Color.red);
        area.createToolTip();
        area.setToolTipText("Major Chords and M7ths");
        area.append("Major Chord and with Major Sevenths will be here.  ");

        JTextArea area2 = new JTextArea(1, 50);   //min
        area2.setBounds(100, 160, 800, 100);
        area2.setFont(new Font("Century", Font.BOLD, 16));
        area2.setEditable(false);
        area2.setLineWrap(true);
        p.add(area2);
        area2.setForeground(Color.BLACK);
        area2.createToolTip();
        area2.setToolTipText("minor Chords");
        area2.append("Minor chords on this line.");

        JTextArea area4 = new JTextArea(1, 50);   //M7th
        area4.setBounds(100, 160, 800, 260);
        area4.setFont(new Font("Century", Font.BOLD, 16));
        area4.setEditable(false);
        area4.setLineWrap(true);
        p.add(area4);
        area4.setForeground(Color.BLUE);
        area4.createToolTip();
        area4.setToolTipText("Major Dom.7th Chords");
        area4.append("The M7th chords.  ");

        JTextArea area3 = new JTextArea(1, 50);   //all
        area3.setBounds(100, 160, 800, 180);
        area3.setFont(new Font("Century", Font.BOLD, 16));
        area3.setEditable(false);
        area3.setLineWrap(true);
        p.add(area3);
        area3.createToolTip();
        area3.setToolTipText("Your Scale you created");
        area3.setForeground(Color.DARK_GRAY);
        area3.append("Running collection of all notes in the test and the order input (teaches inversions). ");




        // where all the magic happens################################################

        run.addActionListener(e -> {
            area.setText("");
            area2.setText("");
            area3.setText("");
            area4.setText("");

            // add new code here at top since the ALL scale display is at the end

            // M7th  ////////////////////////////////////////////////////////
            int cnt = 1;
            dDisplay[0] = "";
            while (cnt <= 12) {

                if (scale[12] > 0)
                    dDisplay[0] = "B";

                // special case for C

                if (scale[cnt] == 1) {
                    if ((scale[cnt + 4] == cnt + 4) && scale[cnt + 7] == cnt + 7) {
                        if ((scale[cnt + 10]) == cnt + 10) {
                            area4.append((dDisplay[cnt]) + "" + (dDisplay[cnt + 4])
                                    + "" + (dDisplay[cnt + 7]) + "" + (dDisplay[cnt + 10]) + " ");
                        }
                    }
                }
            if (scale[cnt] > 1 && scale[cnt] < 6)
                if ((scale[cnt]) == cnt && (scale[cnt + 4] == cnt + 4)
                        && scale[cnt + 7] == cnt + 7)
                    if ((scale[cnt - 2]) == cnt - 2)
                        area4.append((dDisplay[cnt]) + "" + (dDisplay[cnt + 4])
                                + "" + (dDisplay[cnt + 7]) + "" + (dDisplay[cnt - 2]) + " ");


                    if (scale[cnt] >= 6 && scale[cnt] < 9)
                        if ((scale[cnt]) == cnt && (scale[cnt + 4] == cnt + 4)
                                && scale[cnt - 5] == cnt - 5)
                            if ((scale[cnt - 2]) == cnt - 2)
                                area4.append((dDisplay[cnt]) + "" + (dDisplay[cnt + 4])
                                        + "" + (dDisplay[cnt - 5]) + "" + (dDisplay[cnt - 2]) + " ");


                            if (scale[cnt] >= 9 && scale[cnt] <= 12)
                                if ((scale[cnt]) == cnt && (scale[cnt - 8] == cnt - 8)
                                        && scale[cnt - 5] == cnt - 5)
                                    if ((scale[cnt - 2]) == cnt - 2)
                                        area4.append((dDisplay[cnt]) + "" + (dDisplay[cnt - 8])
                                                + "" + (dDisplay[cnt - 5]) + "" +
                                                (dDisplay[cnt - 2]) + " ");

                                    cnt++;

                            }

                  /////////////////////  end of M7th
                  ///////////////////////////////////////// min
                 cnt = 1;
                dDisplay[0] = "";
                while (cnt <= 12) {

                    if (scale[12] > 0)
                        dDisplay[0] = "B";

                    if (scale[cnt] > 0 && scale[cnt] < 6) {
                        if ((scale[cnt]) == cnt && (scale[cnt + 3] == cnt + 3)
                                && scale[cnt + 7] == cnt + 7)
                            area2.insert((dDisplay[cnt]) + ""
                                    + (dDisplay[cnt + 3])
                                    + "" + (dDisplay[cnt + 7]) + " ", 0);
                    }
                    if (scale[cnt] >= 6 && scale[cnt] < 9) {
                        if ((scale[cnt]) == cnt && (scale[cnt + 3] == cnt + 3)
                                && scale[cnt - 5] == cnt - 5)
                            area2.insert((dDisplay[cnt]) + "" + (dDisplay[cnt + 3])
                                    + "" + (dDisplay[cnt - 5]) + " ", 0);
                    }
                    if (scale[cnt] >= 9 && scale[cnt] <= 12) {
                        if ((scale[cnt]) == cnt && (scale[cnt - 9] == cnt - 9)
                                && scale[cnt - 5] == cnt - 5)
                            area2.insert((dDisplay[cnt]) + "" + (dDisplay[cnt - 9])
                                    + "" + (dDisplay[cnt - 5]) + " ", 0);
                    }

                    cnt++;
                }
                                            //////////////////////////////////////// maj
                cnt = 1;
                dDisplay[0] = "";
                while (cnt <= 12) {

                    if (scale[12] > 0)
                        dDisplay[0] = "B";

                    if (scale[cnt] > 0 && scale[cnt] < 6) {
                        if ((scale[cnt]) == cnt && (scale[cnt + 4] == cnt + 4)
                                && scale[cnt + 7] == cnt + 7) {
                            if ((scale[cnt - 1]) == cnt - 1) {
                                area.append((dDisplay[cnt]) + "" + (dDisplay[cnt + 4])
                                        + "" + (dDisplay[cnt + 7]) + ""
                                        + (dDisplay[cnt - 1]) + " ");
                            } else
                                area.append((dDisplay[cnt]) + "" + (dDisplay[cnt + 4])
                                        + "" + (dDisplay[cnt + 7]) + " ");
                        }
                    }
                    if (scale[cnt] >= 6 && scale[cnt] < 9) {
                        if ((scale[cnt]) == cnt && (scale[cnt + 4] == cnt + 4)
                                && scale[cnt - 5] == cnt - 5) {
                            if ((scale[cnt - 1]) == cnt - 1) {
                                area.append((dDisplay[cnt]) + "" + (dDisplay[cnt + 4])
                                        + "" + (dDisplay[cnt - 5]) + ""
                                        + (dDisplay[cnt - 1]) + " ");
                            } else
                                area.append((dDisplay[cnt]) + "" + (dDisplay[cnt + 4])
                                        + "" + (dDisplay[cnt - 5]) + " ");
                        }
                    }
                    if (scale[cnt] >= 9 && scale[cnt] <= 12) {
                        if ((scale[cnt]) == cnt && (scale[cnt - 8] == cnt - 8)
                                && scale[cnt - 5] == cnt - 5) {
                            if ((scale[cnt - 1]) == cnt - 1) {
                                area.append((dDisplay[cnt]) + "" + (dDisplay[cnt - 8])
                                        + "" + (dDisplay[cnt - 5]) + ""
                                        + (dDisplay[cnt - 1]) + " ");
                            } else
                                area.append((dDisplay[cnt]) + "" + (dDisplay[cnt - 8])
                                        + "" + (dDisplay[cnt - 5]) + " ");
                        }
                    }
                    area3.append(dDisplay[cnt]);
                    area3.append(" ");
                    cnt++;

                }

            });
        //############################################################################

                kill.addActionListener(e -> {
                    System.exit(1);
                });
                clear.addActionListener(e -> {
                    for (int i = 0; i <= 12; i++) {
                        scale[i] = 0;
                    }
                    for (int i = 0; i <= 12; i++) {
                        dDisplay[i] = "";
                    }
                    area.setText(" ");
                    area2.setText(" ");
                    area3.setText(" ");
                    area4.setText(" ");
                  //  textField.setText("CLR");
                });
                c.addActionListener(e -> {
                    c.isSelected();
                    scale[1] = 1;
                    dDisplay[1] = "C";
                 //   textField.setText("C");
                });
                cx.addActionListener(e -> {
                    cx.isSelected();
                    scale[2] = 2;
                    dDisplay[2] = "C#";
                  //  textField.setText("C#");
                });
                d.addActionListener(e -> {
                    d.isSelected();
                    scale[3] = 3;
                    dDisplay[3] = "D";
                 //   textField.setText("D");
                });
                dx.addActionListener(e -> {
                    dx.isSelected();
                    scale[4] = 4;
                    dDisplay[4] = "D#";
                  //  textField.setText("D#");
                });
                fb.addActionListener(e -> {
                    fb.isSelected();
                    scale[5] = 5;
                    dDisplay[5] = "E";
                 //   textField.setText("E");
                });
                f.addActionListener(e -> {
                    f.isSelected();
                    scale[6] = 6;
                    dDisplay[6] = "F";
                 //   textField.setText("F");
                });
                fx.addActionListener(e -> {
                    fx.isSelected();
                    scale[7] = 7;
                    dDisplay[7] = "F#";
                 //   textField.setText("F#");
                });
                g.addActionListener(e -> {
                    g.isSelected();
                    scale[8] = 8;
                    dDisplay[8] = "G";
                  //  textField.setText("G");
                });
                gx.addActionListener(e -> {
                    gx.isSelected();
                    scale[9] = 9;
                    dDisplay[9] = "G#";
                 //   textField.setText("G#");
                });
                a.addActionListener(e -> {
                    a.isSelected();
                    scale[10] = 10;
                    dDisplay[10] = "A";
                 //   textField.setText("A");
                });
                ax.addActionListener(e -> {
                    ax.isSelected();
                    scale[11] = 11;
                    dDisplay[11] = "A#";
                 //   textField.setText("A#");
                });
                b.addActionListener(e -> {
                    b.isSelected();
                    scale[12] = 12;
                    dDisplay[12] = "B";
                 //   textField.setText("B");


                });

                // set background of panel
                p.setBackground(Color.LIGHT_GRAY);

                // add panel to frame
                z.add(p);

                // set the size of frame
                z.setSize(900, 200);
                z.setLocationRelativeTo(null);
                z.setVisible(true);
                z.setResizable(false);


            }


        }









