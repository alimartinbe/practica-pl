FILE=ResolucionTG18
INC_FILES=fancyhdr.tex general.tex images.tex license.tex frontpage.tex \
	includes.tex listings.tex titlesec.tex

LOGO=logo.pdf
INCPATH=inc/
IMGPATH=img/
SUBPATH=../.

PDF=$(FILE).pdf
TEX=$(FILE).tex
BIB=$(FILE).bin
AUX=$(FILE).aux
INC=$(foreach i,$(INC_FILES),$(INCPATH)$(i))


all: $(PDF)

$(PDF): $(TEX) $(INC) $(IMGPATH)$(LOGO) $(AUX) $(BBL)
	pdflatex $(TEX)

$(AUX): $(TEX) 
	pdflatex $(TEX)

$(BBL): $(BIB) $(AUX) $(TEX)
	bibtex $(FILE)
	pdflatex $(TEX)

$(INCPATH)%.tex: $(SUBPATH)$(INCPATH)%.tex
	mkdir -p $(INCPATH); cd $(INCPATH); ln -s ../$<

$(IMGPATH)$(LOGO): $(SUBPATH)$(IMGPATH)$(LOGO)
	mkdir -p $(IMGPATH); cd $(IMGPATH); ln -s ../$(SUBPATH)$(IMGPATH)$(LOGO)

clean: 
	rm -rf auto $(INCPATH) $(IMGPATH)$(LOGO) *.pdf *.toc *.aux *.blg \
	*.bbl *~ *.log *.out *# *.lof *.lot
	-rmdir --ignore-fail-on-non-empty img/
