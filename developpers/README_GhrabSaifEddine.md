Bonjour,

 J'ai préféré réaliser le travail demandé en tenant comptedu projet fournit, surlequel j'ai apporté pas mal de modifications :
   * Intégration du fichier application.properties afin de tester le flux de données sur une base postgres, mais aussi sur la base fournit par liquibase et  ceci a pour but de faire un interfaçage entre les 2 base, et comprendre davantage le fonctionnement de Liquibase et précisemment les fichiers YAML.
   * Au niveau des repositories, j'ai préféré utiliser un héritage de la classe de base "CrudRepository" au lieu de la classe fournie "Repository" grâce aux fonctions diverses qu'elle fournit (Transactionnelles) et qui sont prêts à être utiliser.
   * Mise à jour du fichier pom.xml selon les modifications ajoutées.
  
  Au niveau du choix du shéma relationnel, j'ai conçu 3 tables de base: 
     * DEVELOPPER             : contenant tout les développeurs
     * PRG_LG                 : contenant tout les langages de programmations
     * ASSOCIATION_PRG_LG_DEV : contient les associations developpeur-langage, et à travers laquelle se fait l'affectation dun langage à un developpeur ( sachant que la relation entre DEVELOPPER et PRG_LG est de type : n..n 
  
  L'API est prête à être utiliser dans le cas où la partie front sera traité afin de pouvoir utiliser les listes qui seront converties en fichier JSON dans un second lieu. Cependant pour tester la partie traité sans partie front, j'ai réalisé des fonctionnalités qui retournent des String et qui sont affiché dans le navigateur (en tenant compte du path de chacune) (ce qui n'est pas le cas, coté faisabilité) pour les autres fonctions qui retournent des List<*entity>.
  
  
  Durée consommée: 3H30
  
  Merci :)
  
    