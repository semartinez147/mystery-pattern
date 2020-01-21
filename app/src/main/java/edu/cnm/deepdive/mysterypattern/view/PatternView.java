package edu.cnm.deepdive.mysterypattern.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import edu.cnm.deepdive.mysterypattern.model.Position;
import edu.cnm.deepdive.mysterypattern.model.Terrain;
import java.util.List;

public class PatternView extends View {

  private List<Position> vertices;
  private Terrain terrain;
  private Bitmap bitmap;
  private Canvas canvas;
  private Paint paint;
  private RectF dest;

//a set of braces at the top of the class but outside any other construct becomes part of instance initialization (gets included in all following constructors)
  {
    setWillNotDraw(false);
    paint = new Paint();
    dest = new RectF();
  }
//constructors
  public PatternView(Context context) {
    super(context);
  }

  public PatternView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
  }

  public PatternView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  public PatternView(Context context, @Nullable AttributeSet attrs, int defStyleAttr,
      int defStyleRes) {
    super(context, attrs, defStyleAttr, defStyleRes);
  }

  @Override
  protected void onDraw(Canvas canvas) {
    if (vertices != null) {
      paint.setColor(Color.BLUE);
      for (Position position : vertices) {
        canvas.drawCircle((float) position.getX(), (float) position.getY(), 25, paint);
      }
    }
  }

  //setters & getters
  public List<Position> getVertices() {
    return vertices;
  }

  public void setVertices(List<Position> vertices) {
    this.vertices = vertices;
  }

  public Terrain getTerrain() {
    return terrain;
  }

  public void setTerrain(Terrain terrain) {
    this.terrain = terrain;
  }
}
