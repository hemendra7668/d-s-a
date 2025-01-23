# Recreate and save the presentation to ensure correct upload

# Initialize a new presentation
presentation = Presentation()

# Slide 1: Title Slide
slide1 = presentation.slides.add_slide(presentation.slide_layouts[0])
title = slide1.shapes.title
subtitle = slide1.placeholders[1]
title.text = "Book Review App"
subtitle.text = "Developed Using Angular, Django, and MongoDB"

# Slide 2: Overview
slide2 = presentation.slides.add_slide(presentation.slide_layouts[1])
title = slide2.shapes.title
content = slide2.placeholders[1]
title.text = "Overview"
content.text = (
    "The Book Review App is designed to:\n"
    "- Allow users to create, view, update, and delete books.\n"
    "- Provide a seamless interface for managing book information.\n"
    "- Utilize modern web development technologies for efficiency and scalability."
)

# Slide 3: Features
slide3 = presentation.slides.add_slide(presentation.slide_layouts[1])
title = slide3.shapes.title
content = slide3.placeholders[1]
title.text = "Features"
content.text = (
    "- **Add Books**: Users can create new book entries.\n"
    "- **List Books**: View a comprehensive list of available books.\n"
    "- **Update Books**: Modify existing book details.\n"
    "- **Delete Books**: Remove books from the list."
)

# Slide 4: Tech Stack
slide4 = presentation.slides.add_slide(presentation.slide_layouts[1])
title = slide4.shapes.title
content = slide4.placeholders[1]
title.text = "Tech Stack"
content.text = (
    "- **Frontend**: Angular for a dynamic and responsive user interface.\n"
    "- **Backend**: Django REST framework for robust APIs.\n"
    "- **Database**: MongoDB for flexible and scalable data storage."
)

# Slide 5: Current Progress
slide5 = presentation.slides.add_slide(presentation.slide_layouts[1])
title = slide5.shapes.title
content = slide5.placeholders[1]
title.text = "Current Progress"
content.text = (
    "- Basic CRUD (Create, Read, Update, Delete) operations are implemented.\n"
    "- Users can:\n"
    "  - Add new books.\n"
    "  - View a list of books.\n"
    "  - Update existing book details.\n"
    "  - Delete books.\n"
    "- Next Steps:\n"
    "  - Implement user authentication.\n"
    "  - Add book reviews and ratings functionality."
)

# Slide 6: Future Enhancements
slide6 = presentation.slides.add_slide(presentation.slide_layouts[1])
title = slide6.shapes.title
content = slide6.placeholders[1]
title.text = "Future Enhancements"
content.text = (
    "- **User Authentication**: Enable secure login and user-specific features.\n"
    "- **Reviews and Ratings**: Allow users to review and rate books.\n"
    "- **Search and Filter**: Implement advanced search and filtering options.\n"
    "- **Responsive Design**: Optimize the app for mobile and desktop devices."
)

# Slide 7: Thank You
slide7 = presentation.slides.add_slide(presentation.slide_layouts[1])
title = slide7.shapes.title
content = slide7.placeholders[1]
title.text = "Thank You!"
content.text = "Feel free to share feedback or suggestions."

# Save the presentation to ensure correct upload
file_path = "/mnt/data/Book_Review_App_Presentation_Reloaded.pptx"
presentation.save(file_path)
file_path