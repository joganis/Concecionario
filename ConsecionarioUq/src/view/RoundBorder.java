package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;

import javax.swing.border.AbstractBorder;

//Clase para crear un borde redondeado
public class RoundBorder extends AbstractBorder {
  private final int radius;
  private final Color color;

  public RoundBorder(int radius, Color color) {
      this.radius = radius;
      this.color = color;
  }

  @Override
  public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
      Graphics2D g2d = (Graphics2D) g.create();
      g2d.setColor(color);
      g2d.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
      g2d.dispose();
  }

  @Override
  public Insets getBorderInsets(Component c) {
      int value = radius / 2;
      return new Insets(value, value, value, value);
  }

  @Override
  public Insets getBorderInsets(Component c, Insets insets) {
      insets.left = insets.top = insets.right = insets.bottom = radius / 2;
      return insets;
  }
}