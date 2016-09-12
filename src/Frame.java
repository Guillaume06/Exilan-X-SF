/**
 * Created by G on 07/09/2016.
 */
import data.Classe.*;
import data.Race.*;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame implements ActionListener{
    public Classe c = new Frontalier();
    public Race r =new Humain();
    public JFrame fenetre;
    public JTextPane infoClasse;
    public JTextPane infoRace;
    public JTextPane forceVal;
    public JTextPane dextVal;
    public JTextPane intelVal;
    public JTextPane chaVal;
    public JTextPane sagVal;
    public JTextPane constiVal;
    public JTextPane capaRace;
    public JTextPane capaClasse;
    public JButton humain;
    public JButton thul;
    public JButton elfe;
    public JButton wraith;
    public JButton nox;
    public JButton fael;
    public JButton marchombre;
    public JButton frontalier;
    public JButton dessinateur;
    public JButton reveur;
    public JButton archer;
    public JButton tireur;
    public JButton barbare;


    class CenteredBoxView extends BoxView {
        public CenteredBoxView(Element elem, int axis) {

            super(elem,axis);
        }
        protected void layoutMajorAxis(int targetSpan, int axis, int[] offsets, int[] spans) {

            super.layoutMajorAxis(targetSpan,axis,offsets,spans);
            int textBlockHeight = 0;
            int offset = 0;

            for (int i = 0; i < spans.length; i++) {

                textBlockHeight = spans[i];
            }
            offset = (targetSpan - textBlockHeight) / 2;
            for (int i = 0; i < offsets.length; i++) {
                offsets[i] += offset;
            }

        }
    }
    class MyEditorKit extends StyledEditorKit {

        public ViewFactory getViewFactory() {
            return new StyledViewFactory();
        }

         class StyledViewFactory implements ViewFactory {

            public View create(Element elem) {
                String kind = elem.getName();
                if (kind != null) {
                    if (kind.equals(AbstractDocument.ContentElementName)) {

                        return new LabelView(elem);
                    } else if (kind.equals(AbstractDocument.ParagraphElementName)) {
                        return new ParagraphView(elem);
                    } else if (kind.equals(AbstractDocument.SectionElementName)) {

                        return new CenteredBoxView(elem, View.Y_AXIS);
                    } else if (kind.equals(StyleConstants.ComponentElementName)) {
                        return new ComponentView(elem);
                    } else if (kind.equals(StyleConstants.IconElementName)) {

                        return new IconView(elem);
                    }
                }

                return new LabelView(elem);
            }

        }
    }

    public Frame() throws BadLocationException {

        // JFrame
        fenetre = new JFrame();

        // JButtons
        JButton humain = new JButton("Humain");
        humain.addActionListener(this);
        humain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                marchombre.setBackground(Color.GREEN);
                frontalier.setBackground(Color.GREEN);
                dessinateur.setBackground(Color.GREEN);
                reveur.setBackground(Color.GREEN);
                archer.setBackground(Color.GREEN);
                tireur.setBackground(Color.GREEN);
                barbare.setBackground(Color.GREEN);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                marchombre.setBackground(UIManager.getColor("control"));
                frontalier.setBackground(UIManager.getColor("control"));
                dessinateur.setBackground(UIManager.getColor("control"));
                reveur.setBackground(UIManager.getColor("control"));
                archer.setBackground(UIManager.getColor("control"));
                tireur.setBackground(UIManager.getColor("control"));
                barbare.setBackground(UIManager.getColor("control"));
            }
        });

        thul = new JButton("Thül");
        thul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                marchombre.setBackground(Color.RED);
                frontalier.setBackground(Color.GREEN);
                dessinateur.setBackground(Color.RED);
                reveur.setBackground(Color.RED);
                archer.setBackground(Color.RED);
                tireur.setBackground(Color.RED);
                barbare.setBackground(Color.GREEN);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                marchombre.setBackground(UIManager.getColor("control"));
                frontalier.setBackground(UIManager.getColor("control"));
                dessinateur.setBackground(UIManager.getColor("control"));
                reveur.setBackground(UIManager.getColor("control"));
                archer.setBackground(UIManager.getColor("control"));
                tireur.setBackground(UIManager.getColor("control"));
                barbare.setBackground(UIManager.getColor("control"));
            }
        });
        thul.addActionListener(this);

        elfe = new JButton("Elfe");
        elfe.addActionListener(this);
        elfe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                marchombre.setBackground(Color.GREEN);
                frontalier.setBackground(Color.GREEN);
                dessinateur.setBackground(Color.GREEN);
                reveur.setBackground(Color.GREEN);
                archer.setBackground(Color.GREEN);
                tireur.setBackground(Color.GREEN);
                barbare.setBackground(Color.RED);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                marchombre.setBackground(UIManager.getColor("control"));
                frontalier.setBackground(UIManager.getColor("control"));
                dessinateur.setBackground(UIManager.getColor("control"));
                reveur.setBackground(UIManager.getColor("control"));
                archer.setBackground(UIManager.getColor("control"));
                tireur.setBackground(UIManager.getColor("control"));
                barbare.setBackground(UIManager.getColor("control"));
            }
        });

        wraith = new JButton("Wraith");
        wraith.addActionListener(this);
        wraith.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                marchombre.setBackground(Color.GREEN);
                frontalier.setBackground(Color.GREEN);
                dessinateur.setBackground(Color.GREEN);
                reveur.setBackground(Color.GREEN);
                archer.setBackground(Color.GREEN);
                tireur.setBackground(Color.GREEN);
                barbare.setBackground(Color.RED);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                marchombre.setBackground(UIManager.getColor("control"));
                frontalier.setBackground(UIManager.getColor("control"));
                dessinateur.setBackground(UIManager.getColor("control"));
                reveur.setBackground(UIManager.getColor("control"));
                archer.setBackground(UIManager.getColor("control"));
                tireur.setBackground(UIManager.getColor("control"));
                barbare.setBackground(UIManager.getColor("control"));
            }
        });

        nox = new JButton("Nox");
        nox.addActionListener(this);
        nox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                marchombre.setBackground(Color.RED);
                frontalier.setBackground(Color.RED);
                dessinateur.setBackground(Color.GREEN);
                reveur.setBackground(Color.GREEN);
                archer.setBackground(Color.RED);
                tireur.setBackground(Color.RED);
                barbare.setBackground(Color.RED);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                marchombre.setBackground(UIManager.getColor("control"));
                frontalier.setBackground(UIManager.getColor("control"));
                dessinateur.setBackground(UIManager.getColor("control"));
                reveur.setBackground(UIManager.getColor("control"));
                archer.setBackground(UIManager.getColor("control"));
                tireur.setBackground(UIManager.getColor("control"));
                barbare.setBackground(UIManager.getColor("control"));
            }
        });

        fael = new JButton("Faël");
        fael.addActionListener(this);
        fael.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                marchombre.setBackground(Color.GREEN);
                frontalier.setBackground(Color.GREEN);
                dessinateur.setBackground(Color.RED);
                reveur.setBackground(Color.RED);
                archer.setBackground(Color.GREEN);
                tireur.setBackground(Color.GREEN);
                barbare.setBackground(Color.GREEN);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                marchombre.setBackground(UIManager.getColor("control"));
                frontalier.setBackground(UIManager.getColor("control"));
                dessinateur.setBackground(UIManager.getColor("control"));
                reveur.setBackground(UIManager.getColor("control"));
                archer.setBackground(UIManager.getColor("control"));
                tireur.setBackground(UIManager.getColor("control"));
                barbare.setBackground(UIManager.getColor("control"));
            }
        });

        marchombre = new JButton("Marchombre");
        marchombre.addActionListener(this);
        marchombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                humain.setBackground(Color.GREEN);
                thul.setBackground(Color.RED);
                elfe.setBackground(Color.GREEN);
                wraith.setBackground(Color.GREEN);
                nox.setBackground(Color.RED);
                fael.setBackground(Color.GREEN);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                humain.setBackground(UIManager.getColor("control"));
                thul.setBackground(UIManager.getColor("control"));
                elfe.setBackground(UIManager.getColor("control"));
                wraith.setBackground(UIManager.getColor("control"));
                nox.setBackground(UIManager.getColor("control"));
                fael.setBackground(UIManager.getColor("control"));
            }
        });

        frontalier = new JButton("Frontalier");
        frontalier.addActionListener(this);
        frontalier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                humain.setBackground(Color.GREEN);
                thul.setBackground(Color.GREEN);
                elfe.setBackground(Color.GREEN);
                wraith.setBackground(Color.GREEN);
                nox.setBackground(Color.RED);
                fael.setBackground(Color.GREEN);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                humain.setBackground(UIManager.getColor("control"));
                thul.setBackground(UIManager.getColor("control"));
                elfe.setBackground(UIManager.getColor("control"));
                wraith.setBackground(UIManager.getColor("control"));
                nox.setBackground(UIManager.getColor("control"));
                fael.setBackground(UIManager.getColor("control"));
            }
        });

        dessinateur = new JButton("Dessinateur");
        dessinateur.addActionListener(this);
        dessinateur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                humain.setBackground(Color.GREEN);
                thul.setBackground(Color.RED);
                elfe.setBackground(Color.GREEN);
                wraith.setBackground(Color.GREEN);
                nox.setBackground(Color.GREEN);
                fael.setBackground(Color.RED);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                humain.setBackground(UIManager.getColor("control"));
                thul.setBackground(UIManager.getColor("control"));
                elfe.setBackground(UIManager.getColor("control"));
                wraith.setBackground(UIManager.getColor("control"));
                nox.setBackground(UIManager.getColor("control"));
                fael.setBackground(UIManager.getColor("control"));
            }
        });

        reveur = new JButton("Rêveur");
        reveur.addActionListener(this);
        reveur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                humain.setBackground(Color.GREEN);
                thul.setBackground(Color.RED);
                elfe.setBackground(Color.GREEN);
                wraith.setBackground(Color.GREEN);
                nox.setBackground(Color.GREEN);
                fael.setBackground(Color.RED);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                humain.setBackground(UIManager.getColor("control"));
                thul.setBackground(UIManager.getColor("control"));
                elfe.setBackground(UIManager.getColor("control"));
                wraith.setBackground(UIManager.getColor("control"));
                nox.setBackground(UIManager.getColor("control"));
                fael.setBackground(UIManager.getColor("control"));
            }
        });

        archer = new JButton("Archer");
        archer.addActionListener(this);
        archer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                humain.setBackground(Color.GREEN);
                thul.setBackground(Color.RED);
                elfe.setBackground(Color.GREEN);
                wraith.setBackground(Color.GREEN);
                nox.setBackground(Color.RED);
                fael.setBackground(Color.GREEN);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                humain.setBackground(UIManager.getColor("control"));
                thul.setBackground(UIManager.getColor("control"));
                elfe.setBackground(UIManager.getColor("control"));
                wraith.setBackground(UIManager.getColor("control"));
                nox.setBackground(UIManager.getColor("control"));
                fael.setBackground(UIManager.getColor("control"));
            }
        });

        tireur = new JButton("Tireur");
        tireur.addActionListener(this);
        tireur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                humain.setBackground(Color.GREEN);
                thul.setBackground(Color.RED);
                elfe.setBackground(Color.GREEN);
                wraith.setBackground(Color.GREEN);
                nox.setBackground(Color.RED);
                fael.setBackground(Color.GREEN);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                humain.setBackground(UIManager.getColor("control"));
                thul.setBackground(UIManager.getColor("control"));
                elfe.setBackground(UIManager.getColor("control"));
                wraith.setBackground(UIManager.getColor("control"));
                nox.setBackground(UIManager.getColor("control"));
                fael.setBackground(UIManager.getColor("control"));
            }
        });

        barbare = new JButton("Barbare");
        barbare.addActionListener(this);
        barbare.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                humain.setBackground(Color.GREEN);
                thul.setBackground(Color.GREEN);
                elfe.setBackground(Color.RED);
                wraith.setBackground(Color.RED);
                nox.setBackground(Color.RED);
                fael.setBackground(Color.RED);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                humain.setBackground(UIManager.getColor("control"));
                thul.setBackground(UIManager.getColor("control"));
                elfe.setBackground(UIManager.getColor("control"));
                wraith.setBackground(UIManager.getColor("control"));
                nox.setBackground(UIManager.getColor("control"));
                fael.setBackground(UIManager.getColor("control"));
            }
        });

        // JPanel
        JPanel race = new JPanel();
        race.setLayout(new GridLayout(3, 2));
        race.add(humain);
        race.add(thul);
        race.add(elfe);
        race.add(wraith);
        race.add(nox);
        race.add(fael);

        JPanel classe = new JPanel();
        classe.setLayout(new GridLayout(4, 2));
        classe.add(marchombre);
        classe.add(frontalier);
        classe.add(dessinateur);
        classe.add(reveur);
        classe.add(archer);
        classe.add(tireur);
        classe.add(barbare);


        // JTextPane
        capaRace = new JTextPane();
        capaRace.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        capaRace.setFont(new Font("Silom", Font.BOLD, 12));
        capaRace.setBorder(
                javax.swing.BorderFactory.createCompoundBorder(
                        javax.swing.BorderFactory.createTitledBorder(
                                null, "Capacités de  race",
                                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                                new java.awt.Font("Verdana", 1, 11)
                        ),
                        javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10)
                )
        );

        capaClasse = new JTextPane();
        capaClasse.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        capaClasse.setFont(new Font("Silom", Font.BOLD, 12));
        capaClasse.setBorder(
                javax.swing.BorderFactory.createCompoundBorder(
                        javax.swing.BorderFactory.createTitledBorder(
                                null, "Capacités de  classe",
                                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                                new java.awt.Font("Verdana", 1, 11)
                        ),
                        javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10)
                )
        );


        infoRace = new JTextPane();
        infoRace.setFont(new Font("Silom", Font.BOLD, 20));
        infoRace.setEditable(false);
        infoRace.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        infoRace.setEditorKit(new MyEditorKit());
        SimpleAttributeSet attrs=new SimpleAttributeSet();
        StyleConstants.setAlignment(attrs,StyleConstants.ALIGN_CENTER);
        StyledDocument doc=(StyledDocument)infoRace.getDocument();
        doc.setParagraphAttributes(0,doc.getLength()-1,attrs,false);
        infoRace.setText("Humain");

        infoClasse = new JTextPane();
        infoClasse.setFont(new Font("Silom", Font.BOLD, 20));
        infoClasse.setEditable(false);
        infoClasse.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        infoClasse.setEditorKit(new MyEditorKit());
        attrs=new SimpleAttributeSet();
        StyleConstants.setAlignment(attrs,StyleConstants.ALIGN_CENTER);
        doc=(StyledDocument)infoClasse.getDocument();
        doc.setParagraphAttributes(0,doc.getLength()-1,attrs,false);
        infoClasse.setText("Frontalier");


        JTextPane force = new JTextPane();
        force.setEditable(false);
        force.setFont(new Font("Silom", Font.BOLD, 15));
        force.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        force.setEditorKit(new MyEditorKit());
        attrs=new SimpleAttributeSet();
        StyleConstants.setAlignment(attrs,StyleConstants.ALIGN_CENTER);
        doc=(StyledDocument)infoRace.getDocument();
        doc.setParagraphAttributes(0,doc.getLength()-1,attrs,false);
        force.setText("Force");
        force.setBorder(
                javax.swing.BorderFactory.createCompoundBorder(
                        javax.swing.BorderFactory.createTitledBorder(
                                null, "",
                                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                                new java.awt.Font("Verdana", 1, 11)
                        ),
                        javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10)
                )
        );

        forceVal = new JTextPane();
        forceVal.setEditable(false);
        forceVal.setFont(new Font("Silom", Font.BOLD, 15));
        forceVal.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        forceVal.setEditorKit(new MyEditorKit());
        attrs=new SimpleAttributeSet();
        doc=(StyledDocument)forceVal.getDocument();
        doc.setParagraphAttributes(0,doc.getLength()-1,attrs,false);
        forceVal.setBorder(
                javax.swing.BorderFactory.createCompoundBorder(
                        javax.swing.BorderFactory.createTitledBorder(
                                null, "",
                                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                                new java.awt.Font("Verdana", 1, 11)
                        ),
                        javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10)
                )
        );

        JTextPane dext = new JTextPane();
        dext.setEditable(false);
        dext.setFont(new Font("Silom", Font.BOLD, 15));
        dext.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        dext.setEditorKit(new MyEditorKit());
        attrs=new SimpleAttributeSet();
        doc=(StyledDocument)dext.getDocument();
        doc.setParagraphAttributes(0,doc.getLength()-1,attrs,false);
        dext.setText("Dextérité");
        dext.setBorder(
                javax.swing.BorderFactory.createCompoundBorder(
                        javax.swing.BorderFactory.createTitledBorder(
                                null, "",
                                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                                new java.awt.Font("Verdana", 1, 11)
                        ),
                        javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10)
                )
        );

        dextVal = new JTextPane();
        dextVal.setEditable(false);
        dextVal.setFont(new Font("Silom", Font.BOLD, 15));
        dextVal.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        dextVal.setEditorKit(new MyEditorKit());
        attrs=new SimpleAttributeSet();
        doc=(StyledDocument)dextVal.getDocument();
        doc.setParagraphAttributes(0,doc.getLength()-1,attrs,false);
        dextVal.setBorder(
                javax.swing.BorderFactory.createCompoundBorder(
                        javax.swing.BorderFactory.createTitledBorder(
                                null, "",
                                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                                new java.awt.Font("Verdana", 1, 11)
                        ),
                        javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10)
                )
        );

        JTextPane consti = new JTextPane();
        consti.setEditable(false);
        consti.setFont(new Font("Silom", Font.BOLD, 15));
        consti.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        consti.setEditorKit(new MyEditorKit());
        attrs=new SimpleAttributeSet();
        doc=(StyledDocument)consti.getDocument();
        doc.setParagraphAttributes(0,doc.getLength()-1,attrs,false);
        consti.setText("Constitution");
        consti.setBorder(
                javax.swing.BorderFactory.createCompoundBorder(
                        javax.swing.BorderFactory.createTitledBorder(
                                null, "",
                                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                                new java.awt.Font("Verdana", 1, 11)
                        ),
                        javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10)
                )
        );

        constiVal = new JTextPane();
        constiVal.setEditable(false);
        constiVal.setFont(new Font("Silom", Font.BOLD, 15));
        constiVal.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        constiVal.setEditorKit(new MyEditorKit());
        attrs=new SimpleAttributeSet();
        doc=(StyledDocument)constiVal.getDocument();
        doc.setParagraphAttributes(0,doc.getLength()-1,attrs,false);
        constiVal.setBorder(
                javax.swing.BorderFactory.createCompoundBorder(
                        javax.swing.BorderFactory.createTitledBorder(
                                null, "",
                                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                                new java.awt.Font("Verdana", 1, 11)
                        ),
                        javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10)
                )
        );

        JTextPane intel = new JTextPane();
        intel.setEditable(false);
        intel.setFont(new Font("Silom", Font.BOLD, 15));
        intel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        intel.setEditorKit(new MyEditorKit());
        attrs=new SimpleAttributeSet();
        doc=(StyledDocument)intel.getDocument();
        doc.setParagraphAttributes(0,doc.getLength()-1,attrs,false);
        intel.setText("Intelligence");
        intel.setBorder(
                javax.swing.BorderFactory.createCompoundBorder(
                        javax.swing.BorderFactory.createTitledBorder(
                                null, "",
                                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                                new java.awt.Font("Verdana", 1, 11)
                        ),
                        javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10)
                )
        );

        intelVal = new JTextPane();
        intelVal.setEditable(false);
        intelVal.setFont(new Font("Silom", Font.BOLD, 15));
        intelVal.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        intelVal.setEditorKit(new MyEditorKit());
        attrs=new SimpleAttributeSet();
        doc=(StyledDocument)intelVal.getDocument();
        doc.setParagraphAttributes(0,doc.getLength()-1,attrs,false);
        intelVal.setBorder(
                javax.swing.BorderFactory.createCompoundBorder(
                        javax.swing.BorderFactory.createTitledBorder(
                                null, "",
                                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                                new java.awt.Font("Verdana", 1, 11)
                        ),
                        javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10)
                )
        );

        JTextPane sag = new JTextPane();
        sag.setEditable(false);
        sag.setFont(new Font("Silom", Font.BOLD, 15));
        sag.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        sag.setEditorKit(new MyEditorKit());
        attrs=new SimpleAttributeSet();
        doc=(StyledDocument)sag.getDocument();
        doc.setParagraphAttributes(0,doc.getLength()-1,attrs,false);
        sag.setText("Sagesse");
        sag.setBorder(
                javax.swing.BorderFactory.createCompoundBorder(
                        javax.swing.BorderFactory.createTitledBorder(
                                null, "",
                                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                                new java.awt.Font("Verdana", 1, 11)
                        ),
                        javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10)
                )
        );

        sagVal = new JTextPane();
        sagVal.setEditable(false);
        sagVal.setFont(new Font("Silom", Font.BOLD, 15));
        sagVal.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        sagVal.setEditorKit(new MyEditorKit());
        attrs=new SimpleAttributeSet();
        doc=(StyledDocument)sagVal.getDocument();
        doc.setParagraphAttributes(0,doc.getLength()-1,attrs,false);
        sagVal.setBorder(
                javax.swing.BorderFactory.createCompoundBorder(
                        javax.swing.BorderFactory.createTitledBorder(
                                null, "",
                                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                                new java.awt.Font("Verdana", 1, 11)
                        ),
                        javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10)
                )
        );

        JTextPane cha = new JTextPane();
        cha.setEditable(false);
        cha.setFont(new Font("Silom", Font.BOLD, 15));
        cha.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        cha.setEditorKit(new MyEditorKit());
        attrs=new SimpleAttributeSet();
        doc=(StyledDocument)cha.getDocument();
        doc.setParagraphAttributes(0,doc.getLength()-1,attrs,false);
        cha.setText("Charisme");
        cha.setBorder(
                javax.swing.BorderFactory.createCompoundBorder(
                        javax.swing.BorderFactory.createTitledBorder(
                                null, "",
                                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                                new java.awt.Font("Verdana", 1, 11)
                        ),
                        javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10)
                )
        );

        chaVal = new JTextPane();
        chaVal.setEditable(false);
        chaVal.setFont(new Font("Silom", Font.BOLD, 15));
        chaVal.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        chaVal.setEditorKit(new MyEditorKit());
        attrs=new SimpleAttributeSet();
        doc=(StyledDocument)chaVal.getDocument();
        doc.setParagraphAttributes(0,doc.getLength()-1,attrs,false);
        chaVal.setBorder(
                javax.swing.BorderFactory.createCompoundBorder(
                        javax.swing.BorderFactory.createTitledBorder(
                                null, "",
                                javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                                javax.swing.border.TitledBorder.DEFAULT_POSITION,
                                new java.awt.Font("Verdana", 1, 11)
                        ),
                        javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10)
                )
        );

        // Frame
        fenetre.setTitle("Ewilan X SF");
        fenetre.setLayout(new GridLayout(9, 2));

        // Add Components
        fenetre.add(infoRace);
        fenetre.add(infoClasse);
        fenetre.add(force);
        fenetre.add(forceVal);
        fenetre.add(dext);
        fenetre.add(dextVal);
        fenetre.add(consti);
        fenetre.add(constiVal);
        fenetre.add(intel);
        fenetre.add(intelVal);
        fenetre.add(sag);
        fenetre.add(sagVal);
        fenetre.add(cha);
        fenetre.add(chaVal);
        fenetre.add(race);
        fenetre.add(classe);
        fenetre.add(capaRace);
        fenetre.add(capaClasse);

        // Init
        forceVal.setText(Integer.toString(10 + r.force + c.force));
        dextVal.setText(Integer.toString(10 + r.dext + c.dext));
        constiVal.setText(Integer.toString(10 + r.consti + c.consti));
        intelVal.setText(Integer.toString(10 + r.intel + c.intel));
        sagVal.setText(Integer.toString(10 + r.sag + c.sag));
        chaVal.setText(Integer.toString(10 + r.cha + c.cha));
        capaClasse.setText(c.capa);
        capaRace.setText(r.capa);


        // Frame
        fenetre.setSize(1920, 900);
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command){
            case "Humain" :
                 r = new Humain();
                break;
            case "Thül" :
                r = new Thul();
                break;
            case "Elfe" :
                r = new Elfe();
                break;
            case "Wraith" :
                r = new Wraith();
                break;
            case "Nox" :
                r = new Nox();
                break;
            case "Faël" :
                r = new Fael();
                break;
            case "Marchombre" :
                c = new Marchombre();
                break;
            case "Frontalier" :
                c = new Frontalier();
                break;
            case "Dessinateur" :
                c = new Dessinateur();
                break;
            case "Rêveur" :
                c = new Reveur();
                break;
            case "Archer" :
                c = new Archer();
                break;
            case "Tireur" :
                c = new Tireur();
                break;
            case "Barbare" :
                c = new Barbare();
                break;
        }
        r.synergie(r,c);
        infoClasse.setText(c.name);
        infoRace.setText(r.name);
        if (r.good) {
            forceVal.setText(Integer.toString(10 + r.force + c.force));
            dextVal.setText(Integer.toString(10 + r.dext + c.dext));
            constiVal.setText(Integer.toString(10 + r.consti + c.consti));
            intelVal.setText(Integer.toString(10 + r.intel + c.intel));
            sagVal.setText(Integer.toString(10 + r.sag + c.sag));
            chaVal.setText(Integer.toString(10 + r.cha + c.cha));
            capaClasse.setText(c.capa);
            capaRace.setText(r.capa);
        }else{
            forceVal.setText("Combinaison impossible");
            dextVal.setText("Combinaison impossible");
            constiVal.setText("Combinaison impossible");
            intelVal.setText("Combinaison impossible");
            sagVal.setText("Combinaison impossible");
            chaVal.setText("Combinaison impossible");
        }

        c = (Classe) c.update();
        r = (Race) r.update();
        fenetre.invalidate();
        fenetre.revalidate();
        fenetre.validate();
        fenetre.repaint();
    }


    public static void main(String[] args) throws BadLocationException {
        new Frame();
    }
}