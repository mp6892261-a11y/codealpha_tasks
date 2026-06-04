import tkinter as tk
from deep_translator import GoogleTranslator

def translate_text():
    try:
        text = input_box.get("1.0", tk.END).strip()
        if text:
            translated = GoogleTranslator(source='auto', target='hi').translate(text)
            output_box.delete("1.0", tk.END)
            output_box.insert(tk.END, translated)
    except Exception as e:
        output_box.delete("1.0", tk.END)
        output_box.insert(tk.END, f"Error: {e}")

root = tk.Tk()
root.title("Language Translator - CodeAlpha")
root.geometry("500x400")

tk.Label(root, text="Enter English Text:", font=("Arial", 12)).pack(pady=10)
input_box = tk.Text(root, height=5, width=50)
input_box.pack()

tk.Button(root, text="Translate to Hindi", command=translate_text, bg="#4CAF50", fg="white").pack(pady=10)

tk.Label(root, text="Hindi Translation:", font=("Arial", 12)).pack(pady=10)
output_box = tk.Text(root, height=5, width=50)
output_box.pack()

root.mainloop()