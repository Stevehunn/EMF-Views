rule firstChapter
match s : publication!Publication
with  t : book!Chapter
{
  compare
  {
    return s.title = t.eContainer().title and t = t.eContainer().eContents().first();
  }
}
