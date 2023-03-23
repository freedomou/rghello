package cn.ncjti.rghello;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class CircleView extends View {
    public CircleView(Context context) {
        super(context);
    }

    public CircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int r = getMeasuredWidth() / 2;
        int centerX = getLeft() + r;
        int centerY = getTop()+ r;
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        //开始绘制
        canvas.drawCircle(centerX, centerY, r, paint);
    }
}
