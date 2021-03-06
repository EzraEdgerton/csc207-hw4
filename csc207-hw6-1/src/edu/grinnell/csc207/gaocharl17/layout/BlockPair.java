package edu.grinnell.csc207.gaocharl17.layout;

public class BlockPair
    implements TextBlock
{

  private TextBlock _contents;
  private int width;

  /**
   * Create a new truncated block of the specified width.
   */
  public BlockPair(TextBlock tb)
  {
    this._contents = tb;
    this.width = (_contents.width()) * 2;
  } // BlockPair(TextBlock, int)

  /**
   * Get the ith row of the block.
   */
  public String row(int i)
    throws Exception
  {

    if (i >= 0 && i < _contents.height() && _contents.width() > 0)
      {
        return _contents.row(i) + _contents.row(i);
      }

    throw new Exception("Invalid row: " + i);
  } // row(int)

  /**
   * Determine how many rows are in the block.
   */
  public int height()
  {
    return _contents.height();
  } // height()

  /**
   * Determine how many columns are in the block.
   */
  public int width()
  {
    return width;
  } // width()
} // class BlockPair